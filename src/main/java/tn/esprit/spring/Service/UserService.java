package tn.esprit.spring.Service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.Entity.User;

public interface UserService {
	List<User>retrieveAllUsers();
	User addUser (User u);
	void deleteUser (Long id);
	Optional<User> retrieveUser (Long id);
	User updateUser(User client);

}
