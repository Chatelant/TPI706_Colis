package gestiondecolis;

import gestiondecolis.jpa.Colis;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

//import fr.usmb.m2isc.mesure.jpa.Mesure;

@Stateless
@LocalBean
public class ColisEJB {
    @PersistenceContext
    private EntityManager em;


    /**
     * Constructeur sans parametre obligatoire
     */
    public ColisEJB(){}

    /**
     * Ajout d'un nouveau colis.
     *
     * @param
     * @param
     * @return
     */
    public Colis addColis(double poids, double valeur, String origine, String destination) {
        Colis m = new Colis(poids, valeur, origine, destination);
        em.persist(m);
        return m;
    }

    /**
     * Recuperation d'un colis a l'aide de son identifiant unique.
     *
     * @param id identifiant de la mesure
     * @return mesure correspondant a l'identifiant ou null
     */
    public Colis findColis(long id) {
        return em.find(Colis.class, id);
    }


}