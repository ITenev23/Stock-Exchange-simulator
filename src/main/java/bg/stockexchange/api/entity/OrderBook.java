package bg.stockexchange.api.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * @author ITenev
 * created on 2/25/2020
 * <p>
 * A buy order is called a bid
 * A sell order is called a ask
 */
@Entity
@Table(name = "order_book")
public class OrderBook extends BaseEntity {

    private Long totalInstruments;

    private Long totalBuyOrders;

    private Long totalSellOrders;

    private Long totalTrades;

    private List<Instrument> instruments;

    public Long getTotalInstruments() {
        return this.totalInstruments;
    }

    public void setTotalInstruments(Long totalInstruments) {
        this.totalInstruments = totalInstruments;
    }

    public Long getTotalBuyOrders() {
        return this.totalBuyOrders;
    }

    public void setTotalBuyOrders(Long totalBuyOrders) {
        this.totalBuyOrders = totalBuyOrders;
    }

    public Long getTotalSellOrders() {
        return this.totalSellOrders;
    }

    public void setTotalSellOrders(Long totalSellOrders) {
        this.totalSellOrders = totalSellOrders;
    }

    public Long getTotalTrades() {
        return this.totalTrades;
    }

    public void setTotalTrades(Long totalTrades) {
        this.totalTrades = totalTrades;
    }

    @OneToMany
    public List<Instrument> getInstruments() {
        return this.instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

}
