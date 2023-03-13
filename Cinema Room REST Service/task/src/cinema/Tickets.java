package cinema;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Tickets {
    @JsonProperty
    private UUID token;
    @JsonIgnore
    private Seats seat;

    public Tickets(Seats seat) {
        token = UUID.randomUUID();
        this.seat = seat;
    }

    public Tickets() {

    }

    public UUID getUuid() {
        return token;
    }

    public void setUuid(UUID uuid) {
        this.token = uuid;
    }

    public Seats getSeat() {
        return seat;
    }

    public void setSeat(Seats seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = (this == o);
        if (!result) {
            if (o == null || getClass() != o.getClass()) {
                result = false;
            } else {
                Tickets ticket = (Tickets) o;
                result = (token.equals(ticket.token));
            }
        }
        return result;
    }

    /*@Override
    public int hashCode() {
        return token;
    }*/
}
