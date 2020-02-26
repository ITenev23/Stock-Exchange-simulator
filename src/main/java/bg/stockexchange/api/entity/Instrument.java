package bg.stockexchange.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * @author ITenev
 * created on 2/26/2020
 */
@Entity
@Table(name = "instruments")
public class Instrument extends BaseEntity {

    private String symbol;

    private String name;

    private List<Order> orders;

}
