package tn.esprit.spring.Service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.Entity.PlaceParking;

public interface PlaceParkingService {
	List<PlaceParking> retrieveAllPlaceParkings();
	PlaceParking addPlaceParking (PlaceParking pp);
	void deletePlaceParking (Long id);
	Optional<PlaceParking> retrievePlaceParking (Long id);
	PlaceParking updatePlaceParking(PlaceParking placeparking);
}
