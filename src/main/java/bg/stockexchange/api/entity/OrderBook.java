package bg.stockexchange.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author ITenev
 * created on 2/25/2020
 *
 * A buy order is called a bid
 * A sell order is called a ask
 *
 */
@Entity
@Table(name = "order_book")
public class OrderBook extends BaseEntity{

    private Date bidTime;

    private Long bidId;

    private Long bidQuantity;

    private Long bidPrice;

    private Long askPrice;

    private Long askQuantity;

    private Long askId;

    private Date askTime;

    public Date getBidTime() {
        return this.bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public Long getBidId() {
        return this.bidId;
    }

    public void setBidId(Long bidId) {
        this.bidId = bidId;
    }

    public Long getBidQuantity() {
        return this.bidQuantity;
    }

    public void setBidQuantity(Long bidQuantity) {
        this.bidQuantity = bidQuantity;
    }

    public Long getBidPrice() {
        return this.bidPrice;
    }

    public void setBidPrice(Long bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Long getAskPrice() {
        return this.askPrice;
    }

    public void setAskPrice(Long askPrice) {
        this.askPrice = askPrice;
    }

    public Long getAskQuantity() {
        return this.askQuantity;
    }

    public void setAskQuantity(Long askQuantity) {
        this.askQuantity = askQuantity;
    }

    public Long getAskId() {
        return this.askId;
    }

    public void setAskId(Long askId) {
        this.askId = askId;
    }

    public Date getAskTime() {
        return this.askTime;
    }

    public void setAskTime(Date askTime) {
        this.askTime = askTime;
    }
}
