package dio.santander.service;

import dio.santander.domain.model.User;
import dio.santander.domain.repository.UserRepository;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
