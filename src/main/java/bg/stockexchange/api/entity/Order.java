package bg.stockexchange.api.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author ITenev
 * created on 2/25/2020
 */
@MappedSuperclass
public abstract class Order extends BaseEntity {

    private Long quantity;

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

}
