package bg.stockexchange.api.payload.user;

import bg.stockexchange.api.constant.ConfigurationConstants;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class UserRegisterRequestModel {

    @Email(message = ConfigurationConstants.User.ERROR_EMAIL_VALIDATION)
    private String email;

    @Pattern(regexp = ".*", message = ConfigurationConstants.User.ERROR_PASSWORD_VALIDATION)
    private String password;

    private String username;

    private String confirm;

    private Date bornOn;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public Date getBornOn() {
        return this.bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
