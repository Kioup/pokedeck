/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;
import java.util.*;

/**
 *
 * @author licence
 */
public class Pokemon extends Card {
    
    int coutRetraite;
    String type;
    int vie;
    int stage;
    String faiblesse;
    String resistance;
    ArrayList Attacks;

    public Pokemon(String nom, int categorie, int coutRetraite, String type, int vie, int stage, String faiblesse, String resistance, Attacks attacks) {
        this.nom = nom;
        this.categorie = categorie;
        this.coutRetraite = coutRetraite;
        this.type = type;
        this.vie = vie;
        this.stage = stage;
        this.faiblesse = faiblesse;
        this.resistance = resistance;
        this.Attacks.add(attacks);
    }

    public String printCard(String nom){
        nom = this.nom;
        int vie = this.vie;
        String type = this.type;
        String stage = null;
        switch (this.stage){
            case 0:
                stage = "Base";
            break;
            case 1:
                stage = "Niveau 1";
            break;
            case 2:
                stage = "Niveau 2";
            break;
            default:
                stage = "Base";
        }
        String faiblesse = this.faiblesse;
        String resistance = this.resistance;
        int coutRetraite = this.coutRetraite;
        ArrayList Attacks = this.Attacks;
        
        return "----- State Data ----- \n"+
               "        "+"| "+stage+" | "+nom+" : "+vie+" HP ----------- Type : "+type+"\n"+
               "----- Attacks ----- \n"+
               "        "+Attacks+"\n"+
               "----- Type Data ----- \n"+
               "        "+"Faiblesse : "+faiblesse+" | Resistance : "+resistance+" | Cout de Retraite : "+coutRetraite+"\n";
        
    }
    
}
