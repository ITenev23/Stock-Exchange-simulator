package bg.stockexchange.api.payload;

/**
 * @author ITenev
 * created on 2/17/2020
 */
public class SuccessfulRequestViewModel {

    private boolean isSuccessful;

    public SuccessfulRequestViewModel(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public boolean isSuccessful() {
        return this.isSuccessful;
    }

}
