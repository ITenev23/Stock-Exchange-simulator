package bg.stockexchange.api.controller;

import bg.stockexchange.api.exception.DuplicateEmailException;
import bg.stockexchange.api.exception.DuplicateUsernameException;
import bg.stockexchange.api.exception.PasswordMismatchException;
import bg.stockexchange.api.exception.UserAgeException;
import bg.stockexchange.api.payload.UserInfoViewModel;
import bg.stockexchange.api.payload.user.UserRegisterRequestModel;
import bg.stockexchange.api.service.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static bg.stockexchange.api.constant.URLMappings.USER_BASE;

@RestController
@RequestMapping(USER_BASE)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserInfoViewModel> register(@RequestBody @Valid UserRegisterRequestModel model)
            throws PasswordMismatchException, DuplicateEmailException, DuplicateUsernameException {
        return new ResponseEntity<>(this.userService.register(model), HttpStatus.CREATED);
    }
}
