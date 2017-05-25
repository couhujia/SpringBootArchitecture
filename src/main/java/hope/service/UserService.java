package hope.service;

import hope.domain.User;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by hujia on 2017/4/14.
 */
public interface UserService {
    Optional<User> FindByName(String name);

    Collection<User> FindAll();

    Optional<User> FindByEmail(String email);

    Optional<User> FindByPhone(String phone);

    Optional<User> Save(User user);
}
