package bg.stockexchange.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ITenev
 * created on 2/26/2020
 */
@Entity
@Table(name = "instrument_symbols")
public class InstrumentSymbol extends BaseEntity {

    private Long win;

    private Long loss;

    public Long getWin() {
        return this.win;
    }

    public void setWin(Long win) {
        this.win = win;
    }

    public Long getLoss() {
        return this.loss;
    }

    public void setLoss(Long loss) {
        this.loss = loss;
    }
}
