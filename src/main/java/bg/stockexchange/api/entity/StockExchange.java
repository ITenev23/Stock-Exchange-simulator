package bg.stockexchange.api.entity;

import java.util.Date;

/**
 * @author ITenev
 * created on 2/25/2020
 */
public class StockExchange extends BaseEntity {

    private Date timestamp;

    private OrderType type;

    private Long quantity;

    private Long price;

    private boolean IsWorking;

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public OrderType getType() {
        return this.type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public boolean isWorking() {
        return this.IsWorking;
    }

    public void setWorking(boolean working) {
        IsWorking = working;
    }
}
