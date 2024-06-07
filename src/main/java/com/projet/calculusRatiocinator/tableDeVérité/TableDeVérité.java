package com.projet.calculusRatiocinator.tableDeVérité;

public class TableDeVérité {
     public String tableEt(boolean valeur1, boolean valeur2) {
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

    public String tableOu(boolean valeur1, boolean valeur2) {
        if (valeur1 || valeur2) {
            return "Vrai";
        } else if ((!valeur1 ||!valeur2)) {
            return "Faux";
        } else {
            return "Je ne sais pas";
        }
    }

    public String tableImplication(boolean valeur1, boolean valeur2){
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
