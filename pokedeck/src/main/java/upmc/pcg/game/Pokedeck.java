// Copyright 2017 Pierre Talbot (IRCAM)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package upmc.pcg.game;

import upmc.pcg.ui.GameUI;
import java.util.*;

public class Pokedeck
{
  public static void main(String[] args)
  {
    GameUI game_ui = new GameUI();
    game_ui.start();
    
    System.out.println("Entrez le nom de la carte pokemon que vous voulez construire");
    
    // Base des attaques
    
    Attacks Vampigraine = new Attacks("Vampigraine", 20, 2, "A moins que tous les marqueurs de dégats infligés par cette attaque ne soient prévenus, vous pouvez retirer un marqueur de dégat à Bulbizarre");
    Attacks FouetLianes = new Attacks("Fouet Lianes", 30, 3, "");
    Attacks PoudreToxik = new Attacks("Poudre Toxik", 20, 3, "Le Pokemon défenseur est maintenant empoisonné");
    Attacks LanceSoleil = new Attacks("Lance-Soleil", 60, 4, "");
    Attacks Griffe = new Attacks("Griffe", 10, 1, "");
    Attacks Flammeche = new Attacks("Flammèche", 30, 2, "Défausser une energie feu à salameche");
    Attacks Tranche = new Attacks("Tranche", 30, 3, "");
    Attacks LanceFlamme = new Attacks("Lance-Flamme", 50, 3, "Defausser une energie feu à Reptincelle attaché à Reptincel");
    Attacks DanseFlamme = new Attacks("DanseFlamme", 100, 4, "Defausser deux energies feu attachées à Dracaufeu");
    
    // Base des pokemons
    
    Pokemon bulbizarre = new Pokemon("Bulbizarre", 1, 1, "plante", 40, 0, "feu", "aucune", "");
    bulbizarre.addAttacks(Vampigraine);
    Pokemon herbizarre = new Pokemon("Herbizarre", 1, 1, "plante", 60, 1, "feu", "aucune", "");
    herbizarre.addAttacks(FouetLianes);
    herbizarre.addAttacks(PoudreToxik);
    Pokemon florizarre = new Pokemon("Florizarre", 1, 2, "plante", 100, 2, "feu", "aucune", "");
    florizarre.addAttacks(LanceSoleil);
    Pokemon salameche = new Pokemon("Salameche", 1, 1, "feu", 50, 0,"eau", "aucune", "");
    salameche.addAttacks(Griffe);
    salameche.addAttacks(Flammeche);
    Pokemon reptincel = new Pokemon("Reptincel", 1, 1, "feu", 80, 1, "eau", "aucune", "");
    reptincel.addAttacks(Tranche);
    reptincel.addAttacks(LanceFlamme);
    Pokemon dracaufeu = new Pokemon("Dracaufeu", 1, 3, "feu", 120, 2, "eau", "aucune", "");
    dracaufeu.addAttacks(DanseFlamme);
    
    // Base des trainer
    
    Trainer Leo = new Trainer("Leo", 3, "Piochez deux cartes dans votre paquet");
    Trainer Chen = new Trainer("Professeur Chen", 3, "défaussez toutes les cartes de votre main et piochez 7 cartes");
    Trainer Potion = new Trainer("Potion", 3, "Retirez deux marqueurs de dégats au pokemon actif");
    Trainer SuppressionEnergie = new Trainer("Supression d'energie", 3, "Détachez une carte energie attachée à l'un des pokemon de votre adversaire");
    Trainer RechercheEnergie = new Trainer("Recherche d'energie", 3, "Prenez une carte energie de votre deck et ajoutez la à votre main");
    
    // collection
      ArrayList collec = new ArrayList<Card>();
      collec.add(bulbizarre);
      collec.add(herbizarre);
      collec.add(florizarre);
      collec.add(salameche);
      collec.add(reptincel);
      collec.add(dracaufeu);
      collec.add(Leo);
      collec.add(Chen);
      collec.add(Potion);
      collec.add(SuppressionEnergie);
      collec.add(RechercheEnergie);
    }
    
    
  }
