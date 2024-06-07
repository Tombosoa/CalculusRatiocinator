package com.projet.CalculusRatiocinator.grandeComposition;

import com.projet.calculusRatiocinator.affirmation.Mensonge;
import com.projet.calculusRatiocinator.affirmation.SimpleAffirmation;
import com.projet.calculusRatiocinator.affirmation.Vérité;
import com.projet.calculusRatiocinator.composition.Composition;
import com.projet.calculusRatiocinator.conjonctionDeCoordination.ConjonctionDeCoordination;
import com.projet.calculusRatiocinator.grandeComposition.GrandeComposition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrandeCompositionTest {
    @Test
    void grande_composition_test(){
        Mensonge mensonge = new Mensonge("Lou est pauvre");
        SimpleAffirmation simpleAffirmation = new SimpleAffirmation("Lou est généreux");

        Vérité vérité = new Vérité("Lou est beau");

        Composition composition = new Composition(vérité, ConjonctionDeCoordination.ou, simpleAffirmation);
        Composition composition1 = new Composition(mensonge, ConjonctionDeCoordination.ou, vérité);

        GrandeComposition grandeComposition = new GrandeComposition(composition, ConjonctionDeCoordination.donc,composition1);
        assertEquals("Vrai", grandeComposition.obtenirValeurDeVéritéDeGrandeComposition());
    }
}
