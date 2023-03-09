package tn.esprit.spring.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlaceParking implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="status")
    private String status;
   

    @ManyToOne
    Parking parkings ;

    @OneToOne(mappedBy = "placeparkings")
    private User user;
	
    public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Parking getParkings() {
		return parkings;
	}


	public void setParkings(Parking parkings) {
		this.parkings = parkings;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    

	
    
}
