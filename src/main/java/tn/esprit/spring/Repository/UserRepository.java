package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.Entity.User;

public interface UserRepository  extends CrudRepository<User, Long >{


}