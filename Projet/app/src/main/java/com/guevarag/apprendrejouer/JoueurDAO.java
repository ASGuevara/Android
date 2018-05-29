package com.guevarag.apprendrejouer;

import com.guevarag.apprendrejouer.Joueur;
import com.orm.query.Condition;
import com.orm.query.Select;

import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by guevarag on 17/05/18.
 */

public class JoueurDAO {

    public static int creerJoueur(String pseudo,String nom,String prenom,int sexe ,String motDePasse){
        int code=0;
        //test si le joueur de ce pseudo existe déjà
        if(!joueurExistePas(pseudo)){
            return 1;
        }

        if(motDePasse.length()>3){
            //code erreur si le mot de passe trop
            return 2;
        }
        if(pseudo==null||nom==null||prenom==null){
            return 3;
        }


        Joueur joueur=new Joueur(pseudo,nom,prenom,sexe,motDePasse);
        joueur.save();
        return 0;

        //code=0 = joueur inscrit  //  code=3 il manque un champ // code=1 pseudo existe déjà // code=2 mot de passe trop petit //




    }

    public static List<Joueur> trouverTousLesJoueurs(){
        return Joueur.listAll(Joueur.class);
    }


    public static Joueur findJoueurByPseudo(String Pseudo){
        List listejoueur=Joueur.find(Joueur.class,"pseudo=?",Pseudo);
        Joueur j=(Joueur)listejoueur.get(1);
        return j;
    }

    public static boolean joueurExistePas(String pseudo){
        List<Joueur> listejoueur=Joueur.find(Joueur.class,"pseudo=?",pseudo);
        return listejoueur.isEmpty();
        //si vrai n'existe pas et faux si existe
    }

    public static int compterJoueurs(){
        return (int) Joueur.count(Joueur.class);
    }




}
