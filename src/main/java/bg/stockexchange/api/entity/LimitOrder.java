package bg.stockexchange.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ITenev
 * created on 2/25/2020
 */
@Entity
@Table(name = "limit_orders")
public class LimitOrder extends Order {

    private Double price;

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
