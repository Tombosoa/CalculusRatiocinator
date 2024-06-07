package com.projet.CalculusRatiocinator.composition;

import com.projet.calculusRatiocinator.affirmation.Mensonge;
import com.projet.calculusRatiocinator.affirmation.Vérité;
import com.projet.calculusRatiocinator.composition.Composition;
import com.projet.calculusRatiocinator.conjonctionDeCoordination.ConjonctionDeCoordination;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompositionTest {
    @Test
    void Lou_est_beau_donc_Lou_est_pauvre(){
        Vérité vérité = new Vérité("Lou est beau");
        Mensonge mensonge = new Mensonge("Lou est pauvre");

        ConjonctionDeCoordination donc = ConjonctionDeCoordination.donc;
        Composition composition = new Composition(mensonge, donc, vérité);

        assertEquals("Faux", composition.obtenirValeurDeVérité());
    }
}
