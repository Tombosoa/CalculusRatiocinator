package com.projet.calculusRatiocinator.grandeComposition;

import com.projet.calculusRatiocinator.affirmation.Mensonge;
import com.projet.calculusRatiocinator.affirmation.Vérité;
import com.projet.calculusRatiocinator.composition.Composition;
import com.projet.calculusRatiocinator.conjonctionDeCoordination.ConjonctionDeCoordination;
import com.projet.calculusRatiocinator.tableDeVérité.TableDeVérité;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class GrandeComposition {
    private Composition composition1;
    private ConjonctionDeCoordination conjonctionDeCoordination;
    private Composition composition2;

    public String obtenirValeurDeVéritéDeGrandeComposition(){
        TableDeVérité tableDeVérité = new TableDeVérité();
        if(conjonctionDeCoordination.equals(ConjonctionDeCoordination.et)){
            return tableDeVérité.tableEt(traduction(composition1.obtenirValeurDeVérité()), traduction(composition2.obtenirValeurDeVérité()));
        }else if(conjonctionDeCoordination.equals(ConjonctionDeCoordination.ou)){
            return tableDeVérité.tableOu(traduction(composition1.obtenirValeurDeVérité()), traduction(composition2.obtenirValeurDeVérité()));
        }else if(conjonctionDeCoordination.equals(ConjonctionDeCoordination.donc)){
            return tableDeVérité.tableImplication(traduction(composition1.obtenirValeurDeVérité()), traduction(composition2.obtenirValeurDeVérité()));
        }
        return "Je ne sais pas";
    }

    private boolean traduction(String valeur){
        if(valeur.equals("Faux")){
            return false;
        }else if(valeur.equals("Vrai")){
            return true;
        }else{
            return true;
        }
    }
}
