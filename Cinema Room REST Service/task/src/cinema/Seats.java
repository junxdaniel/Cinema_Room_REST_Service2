package cinema;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Seats {
    @JsonProperty
    private Integer row;
    @JsonProperty
    private Integer column;

    private Integer price;

    public Seats(Integer row, Integer column) {
        this.row = row;
        this.column = column;
        this.price = (row <= 4) ? 10 : 8;
    }

    public Seats() {

    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = (this == o);
        if (!result) {
            if (o == null || getClass() != o.getClass()) {
                result = false;
            } else {
                Seats seat = (Seats) o;
                result = (row == seat.row && column == seat.column);
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return 11 * row + column;
    }
}
