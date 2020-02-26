package bg.stockexchange.api.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author ITenev
 * created on 2/26/2020
 */
@Entity
@Table(name = "clients")
public class Client extends BaseEntity {

    private String firstName;

    private String lastName;

    private Long money;

    private List<InstrumentSymbol> instruments;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getMoney() {
        return this.money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    public List<InstrumentSymbol> getInstruments() {
        return this.instruments;
    }

    public void setInstruments(List<InstrumentSymbol> instruments) {
        this.instruments = instruments;
    }
}
