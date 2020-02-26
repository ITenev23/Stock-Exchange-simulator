package bg.stockexchange.api.entity;

import javax.persistence.MappedSuperclass;

/**
 * @author ITenev
 * created on 2/26/2020
 */
@MappedSuperclass
public abstract class CommonProps extends BaseEntity{

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
