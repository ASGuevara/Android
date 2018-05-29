package com.guevarag.apprendrejouer;

import com.orm.SugarRecord;

import java.util.GregorianCalendar;

/**
 * Created by guevarag on 13/04/18.
 */

public class Joueur extends SugarRecord {
    private String motDePasse;
    private String pseudo;
    private String nom;
    private String prenom;
    private int sexe;
    private float score;



    public Joueur(){

    }

    public Joueur(String pseudo,String nom,String prenom,int sexe,String motDePasse){

        //le pseudo est unique, on verifie lors de l'entrée des champs, soit dans JoueurDAO
        this.pseudo=pseudo;
        this.motDePasse=motDePasse;
        this.nom=nom;
        this.prenom=prenom;
        this.score=0;
        this.sexe=sexe;

    }

    public String getPseudo(){
        return this.pseudo;

    }




}
