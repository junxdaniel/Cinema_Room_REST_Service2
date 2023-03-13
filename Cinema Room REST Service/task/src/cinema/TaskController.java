package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
public class TaskController {
    private final Theatre theatre = new Theatre(9,9);

    @GetMapping("/seats")
    public Theatre returnAvailableSeats() {
        return theatre;
    }

    @PostMapping("/purchase")
    public ResponseEntity<Object> returnPurchasedSeats(@RequestBody Seats seat) {

        ResponseEntity<Object> responseEntity;

        if ((seat.getRow() > theatre.getTotal_rows() || seat.getRow() < 1) ||
                (seat.getColumn() > theatre.getTotal_columns() || seat.getColumn() < 1)) {
            responseEntity = new ResponseEntity<Object>(Map.of("error", "The number of a row or a column is out of bounds!"), HttpStatus.BAD_REQUEST);
        } else if (!theatre.getAvailable_seats().contains(seat)) {
            responseEntity = new ResponseEntity<Object>(Map.of("error", "The ticket has been already purchased!"), HttpStatus.BAD_REQUEST);
        }
        else {
            int indexSeat = theatre.getAvailable_seats().indexOf(seat);
            seat = theatre.getAvailable_seats().get(indexSeat);
            Tickets ticket = new Tickets(seat);
            theatre.getTicketsList().add(ticket);
            theatre.getAvailable_seats().remove(seat);
            responseEntity = new ResponseEntity<Object>(Map.of("token",ticket.getUuid(),"ticket",seat), HttpStatus.OK);

        }
        return responseEntity;

    }

    @PostMapping("/return")
    public ResponseEntity<Object> returnReturnedTicket(@RequestBody Tickets ticket) {
        ResponseEntity<Object> responseEntity;

        if (!theatre.getTicketsList().contains(ticket)) {
            responseEntity = new ResponseEntity<Object>(Map.of("error", "Wrong token!"), HttpStatus.BAD_REQUEST);
        } else {
            int ticketIndex = theatre.getTicketsList().indexOf(ticket);
            ticket = theatre.getTicketsList().get(ticketIndex);
            theatre.getTicketsList().remove(ticket);
            theatre.getAvailable_seats().add(ticket.getSeat());
            responseEntity = new ResponseEntity<Object>(Map.of("returned_ticket", ticket.getSeat()), HttpStatus.OK);
        }
        return responseEntity;
    }

    @PostMapping("/stats")
    public ResponseEntity<Object> returnStats (@RequestParam(required = false) String password){
        ResponseEntity<Object> responseEntity;
        if (password == null) {
            responseEntity = new ResponseEntity<Object>(Map.of("error", "The password is wrong!"), HttpStatus.UNAUTHORIZED);
        } else if (password.equals("super_secret")) {
            Income income = new Income(theatre.calcIncome(theatre.getTicketsList()), theatre.getAvailable_seats().size(), theatre.getTicketsList().size());
            responseEntity = new ResponseEntity<Object>(income, HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<Object>(Map.of("error", "The password is wrong!"), HttpStatus.UNAUTHORIZED);
        }
        return responseEntity;
    }
}

