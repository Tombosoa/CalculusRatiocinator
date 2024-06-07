package com.projet.calculusRatiocinator.composition;

import com.projet.calculusRatiocinator.affirmation.Affirmation;
import com.projet.calculusRatiocinator.affirmation.Mensonge;
import com.projet.calculusRatiocinator.affirmation.Vérité;
import com.projet.calculusRatiocinator.conjonctionDeCoordination.ConjonctionDeCoordination;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Composition {
    private Affirmation affirmation1;
    private ConjonctionDeCoordination conjonctionDeCoordination;
    private Affirmation affirmation2;

    public String obtenirValeurDeVérité(){
        if(conjonctionDeCoordination.equals(ConjonctionDeCoordination.et)){
            return tableEt(affirmation1.isValeur(), affirmation2.isValeur());
        } else if (conjonctionDeCoordination.equals(ConjonctionDeCoordination.ou)) {
            return tableOu(affirmation1.isValeur(), affirmation2.isValeur());
        } else if (conjonctionDeCoordination.equals(ConjonctionDeCoordination.donc)) {
            return tableImplication(affirmation1.isValeur(), affirmation2.isValeur());
        } else{
            return "je ne sais pas";
        }
    }

    private String tableEt(boolean valeur1, boolean valeur2) {
        if (valeur1 && valeur2) {
            return "Vrai";
        } else if ((valeur1 &&!valeur2) || (!valeur1 && valeur2)) {
            return "Faux";
        } else if (!valeur1 &&!valeur2) {
            return "Faux";
        } else {
            return "Je ne sais pas";
        }
    }

    private String tableOu(boolean valeur1, boolean valeur2) {
        if (valeur1 || valeur2) {
            return "Vrai";
        } else if ((!valeur1 ||!valeur2)) {
            return "Faux";
        } else {
            return "Je ne sais pas";
        }
    }

    private String tableImplication(boolean valeur1, boolean valeur2){
        if (valeur1 && valeur2) {
            return "Vrai";
        } else if ((valeur1 &&!valeur2) || (!valeur1 && valeur2)) {
            return "Faux";
        } else if (!valeur1 &&!valeur2) {
            return "Vrai";
        } else {
            return "Je ne sais pas";
        }
    }
}
