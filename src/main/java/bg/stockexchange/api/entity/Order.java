package bg.stockexchange.api.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author ITenev
 * created on 2/26/2020
 */
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    private User user;

    private TradeType tradeType;

    private OrderType orderType;

    private Long price;

    private Long quantity;

    private Long filled;

    private OrderStatus status;

    @ManyToOne
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public TradeType getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(TradeType tradeType) {
        this.tradeType = tradeType;
    }

    @ManyToOne
    public OrderType getOrderType() {
        return this.orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getFilled() {
        return this.filled;
    }

    public void setFilled(Long filled) {
        this.filled = filled;
    }

    @ManyToOne
    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

}
