package bg.stockexchange.api.payload;

import bg.stockexchange.api.entity.Role;
import bg.stockexchange.api.entity.User;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class UserInfoViewModel {

    private Long id;

    private String email;

    private String username;

    private Integer age;

    private Date bornOn;

    private List<String> roles;

    public static UserInfoViewModel fromUser(User user) {
        var model = new UserInfoViewModel();

        model.setId(user.getId());
        model.setEmail(user.getEmail());
        model.setUsername(user.getUsername());
        model.setBornOn(user.getBornOn());
        model.setRoles(user.getRoles().stream().map(Role::getName).collect(Collectors.toList()));
        return model;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBornOn() {
        return this.bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    public List<String> getRoles() {
        return this.roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}
