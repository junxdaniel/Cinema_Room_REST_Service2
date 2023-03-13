package cinema;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

public class Theatre {
    private Integer total_rows;
    private Integer total_columns;
    private List<Seats> available_seats;
    @JsonIgnore
    private List<Tickets> ticketsList;

    //private Income income;

    public Theatre(Integer rows, Integer columns) {
        this.total_rows = rows;
        this.total_columns = columns;

        List<Seats> seats = new ArrayList<>();

        for (Integer r = 1; r <= total_rows; r++) {
            for (Integer c = 1; c <= total_columns; c++) {
                seats.add(new Seats(r, c));
            }
        }
        available_seats = seats;
        ticketsList = new ArrayList<Tickets>();
    }

    public Integer getTotal_rows() {
        return total_rows;
    }

    public void setTotal_rows(Integer total_rows) {
        this.total_rows = total_rows;
    }

    public Integer getTotal_columns() {
        return total_columns;
    }

    public void setTotal_columns(Integer total_columns) {
        this.total_columns = total_columns;
    }

    public List<Seats> getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(List<Seats> available_seats) {
        this.available_seats = available_seats;
    }

    public List<Tickets> getTicketsList() {
        return ticketsList;
    }

    public void setTicketsList(List<Tickets> ticketsList) {
        this.ticketsList = ticketsList;
    }

    /*public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }*/

    public Integer calcIncome(List<Tickets> ticketsList) {
        Integer result = 0;

        for (Tickets ticket : ticketsList) {
            result += ticket.getSeat().getPrice();
        }
        return result;
    }
}
