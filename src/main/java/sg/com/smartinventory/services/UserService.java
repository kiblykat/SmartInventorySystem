package sg.com.smartinventory.services;

import java.util.List;

import sg.com.smartinventory.entities.User;

public interface UserService {
    User createUser(User user);

    User getOneUser(Long id);

    List<User> getAllUsers();

    User updateUser(Long id, User user);

    void deleteUser(Long id);

    // User addUserRoleToUser(Long userId, Long roleId);
}
