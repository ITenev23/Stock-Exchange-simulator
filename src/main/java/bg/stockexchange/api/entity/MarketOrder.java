package bg.stockexchange.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ITenev
 * created on 2/25/2020
 */
@Entity
@Table(name = "market_orders")
public class MarketOrder extends Order {
}
