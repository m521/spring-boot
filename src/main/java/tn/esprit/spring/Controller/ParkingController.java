package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Entity.Parking;
import tn.esprit.spring.Service.ParkingService;


@RestController

public class ParkingController {
	@Autowired
	ParkingService parkingService;
	
	@PostMapping("/add-parking")
	@ResponseBody
	Parking addParking(@RequestBody Parking p){
		return parkingService.addParking(p);
		
	}
	
	@GetMapping("/retrieve-allParkings")
	@ResponseBody
	List<Parking> retrieveAllParkings()
	{
		return parkingService.retrieveAllParkings();
	}
	
	@PutMapping("/Modify-parking")
	@ResponseBody
	Parking updateParking(@RequestBody Parking p)
	{
		return parkingService.updateParking(p) ;
	}
	
@DeleteMapping("delete-parking/{libelle}")
	
	void deleteParking(@PathVariable(name="id")Long id)
	{
		parkingService.deleteParking(id);
	}
}
