package gestiondecolis.jpa;
import javax.persistence.*;
import java.io.Serializable;


enum Etat{ENREGISTREMENT, EN_ATTENTE, ACHEMINEMENT, BLOQUE, LIVRE};

@Entity
public class Colis implements Serializable {
    @Id @GeneratedValue
    private long id;
    private double poids;
    private double valeur;
    private String origine;
    private String destination;

    private double latitude;
    private double longitude;
    private String emplacement;
    private Etat etat;


    /**
     * Constructeur sans parametre obligatoire.
     */
    public Colis(){}
    public Colis(double poids, double valeur, String origine, String destination){
        this.poids = poids;
        this.valeur = valeur;
        this.origine = origine;
        this.destination = destination;
        emplacement = origine;
        etat = Etat.ENREGISTREMENT;
        latitude = 0.0;
        longitude = 0.0;
    }

    /**
     * Getters / Setters
     */
    public long getId() {
        return id;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
