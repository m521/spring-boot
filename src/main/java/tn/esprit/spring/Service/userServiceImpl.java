package tn.esprit.spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Entity.User;
import tn.esprit.spring.Repository.UserRepository;

@Service
public class userServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> retrieveAllUsers() {
		
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User addUser(User u) {
		 userRepository.save(u);
		 return u;
	}

	@Override
	public void deleteUser(Long id) {
		
		userRepository.deleteById(id);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> retrieveUser(Long id) {
		
		return userRepository.findById(id) ;
	}

}
