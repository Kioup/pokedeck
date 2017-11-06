/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

/**
 
 * @author licence
 */
public class Attacks {
    
    String name;
    int damages;
    int cost;
    String effect;
    
    public Attacks(String name, int damages, int cost, String effect){
        this.name = name;
        this.damages = damages;
        this.cost = cost;
        this.effect = effect;
    }
    
    @Override
    public String toString() {
       String Cost = "";
       for(int i = 0; i < this.cost; i++){
           Cost+="*";
       }
       String attacks = this.name + "\n"+
       "       "+Cost +"  "+ this.damages + "\n"+ 
       "       "+this.effect;
       return attacks;
    }
    
    public void Vampigraine(Pokemon adv) {
        adv.vie-= 20;
        
    }
    
}
