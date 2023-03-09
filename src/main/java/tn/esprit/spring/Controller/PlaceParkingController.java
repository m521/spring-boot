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

import tn.esprit.spring.Entity.PlaceParking;
import tn.esprit.spring.Service.PlaceParkingService;

@RestController
public class PlaceParkingController {
	@Autowired
	PlaceParkingService placeparkingService;
	
	@PostMapping("/add-placeparking")
	@ResponseBody
	PlaceParking addPlaceParking(@RequestBody PlaceParking pp){
		return placeparkingService.addPlaceParking(pp);
		
	}
	
	
	@GetMapping("/retrieve-allPlacesParkings")
	@ResponseBody
	List<PlaceParking>  retrieveAllPlaceParkings()
	{
		return placeparkingService.retrieveAllPlaceParkings();
	}
	
	
	@PutMapping("/Modify-placeparking")
	@ResponseBody
	PlaceParking updatePlaceParking(@RequestBody PlaceParking pp)
	{
		return placeparkingService.updatePlaceParking(pp) ;
	}
	
	
	@DeleteMapping("delete-placeparking/{id}")
	void deletePlaceParking(@PathVariable(name="id")Long id)
	{
		placeparkingService.deletePlaceParking(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
