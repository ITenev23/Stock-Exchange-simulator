package bg.stockexchange.api.service.user;

import bg.stockexchange.api.entity.User;
import bg.stockexchange.api.exception.DuplicateEmailException;
import bg.stockexchange.api.exception.DuplicateUsernameException;
import bg.stockexchange.api.exception.PasswordMismatchException;
import bg.stockexchange.api.payload.UserInfoViewModel;
import bg.stockexchange.api.payload.user.UserRegisterRequestModel;
import bg.stockexchange.api.repository.RoleRepository;
import bg.stockexchange.api.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(
            UserRepository userRepository,
            RoleRepository roleRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return this.userRepository.findFirstByEmailOrUsername(s, s)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    }

    @Override
    public UserInfoViewModel register(UserRegisterRequestModel request) throws PasswordMismatchException, DuplicateEmailException, DuplicateUsernameException {
        if (!request.getPassword().equals(request.getConfirm())) {
            throw new PasswordMismatchException();
        }

        if (this.userRepository.findFirstByEmail(request.getEmail()).isPresent()) {
            throw new DuplicateEmailException();
        }

        if (this.userRepository.findFirstByUsername(request.getUsername()).isPresent()) {
            throw new DuplicateUsernameException();
        }

        var user = new User();
        user.setDeleted(false);
        user.setEmail(request.getEmail());
        user.setBornOn(request.getBornOn());
        user.setUsername(request.getUsername());
        user.setPassword(this.passwordEncoder.encode(request.getPassword()));
        user.addRole(this.roleRepository.findById(1L).get());

        return UserInfoViewModel.fromUser(this.userRepository.saveAndFlush(user));
    }

}
