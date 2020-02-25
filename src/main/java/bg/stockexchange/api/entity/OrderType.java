package bg.stockexchange.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ITenev
 * created on 2/25/2020
 */
@Entity
@Table(name = "order_types")
public class OrderType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
