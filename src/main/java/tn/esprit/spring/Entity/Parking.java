package tn.esprit.spring.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Parking implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="libelle")
    private String libelle;
    @Column(name="adresse")
    private String adresse;
    @Column(name="capacite")
    private int capacite;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="parkings")
    private Set<PlaceParking> placeparkings;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Set<PlaceParking> getPlaceparkings() {
		return placeparkings;
	}

	public void setPlaceparkings(Set<PlaceParking> placeparkings) {
		this.placeparkings = placeparkings;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
    
    
}
