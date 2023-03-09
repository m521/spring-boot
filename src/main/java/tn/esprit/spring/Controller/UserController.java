package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Entity.User;
import tn.esprit.spring.Service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users") 
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/add-user")
	@ResponseBody
	User addUser(@RequestBody User u){
		return userService.addUser(u);
//		User newUser = userService.addUser(u);
//		return new ResponseEntity<User>(newUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/retrieve-allUsers")
	@ResponseBody
	List<User> retrieveAllUsers()
	{
		return userService.retrieveAllUsers();
	}
	
	@PutMapping("/Modify-user")
	@ResponseBody
	User updateClient(@RequestBody User u)
	{
		return userService.updateUser(u) ;
	}
	
	@DeleteMapping("delete-user/{id}")
	
	void deleteUser(@PathVariable(name="id")Long id)
	{
		userService.deleteUser(id);
	}
	
	
		
	
}
