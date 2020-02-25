package bg.stockexchange.api.service.user;

import bg.stockexchange.api.exception.DuplicateEmailException;
import bg.stockexchange.api.exception.DuplicateUsernameException;
import bg.stockexchange.api.exception.PasswordMismatchException;
import bg.stockexchange.api.payload.UserInfoViewModel;
import bg.stockexchange.api.payload.user.UserRegisterRequestModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserInfoViewModel register(UserRegisterRequestModel model) throws PasswordMismatchException, DuplicateEmailException, DuplicateUsernameException;

}
