package cinema;

public class Income {
    private Integer current_income;
    private Integer number_of_available_seats;
    private Integer number_of_purchased_tickets;

    public Income(Integer current_income, Integer number_of_available_seats, Integer number_of_purchased_tickets) {
        this.current_income = current_income;
        this.number_of_available_seats = number_of_available_seats;
        this.number_of_purchased_tickets = number_of_purchased_tickets;

    }

    public Integer getCurrent_income() {
        return current_income;
    }

    public void setCurrent_income(Integer current_income) {
        this.current_income = current_income;
    }

    public Integer getNumber_of_available_seats() {
        return number_of_available_seats;
    }

    public void setNumber_of_available_seats(Integer number_of_available_seats) {
        this.number_of_available_seats = number_of_available_seats;
    }

    public Integer getNumber_of_purchased_tickets() {
        return number_of_purchased_tickets;
    }

    public void setNumber_of_purchased_tickets(Integer number_of_purchased_tickets) {
        this.number_of_purchased_tickets = number_of_purchased_tickets;
    }
}
