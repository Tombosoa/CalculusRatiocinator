package com.projet.CalculusRatiocinator.composition.affirmation;

import com.projet.calculusRatiocinator.affirmation.Vérité;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VéritéTest {
    @Test
    void la_vérité_est_toujours_vrai(){
        Vérité vérité = new Vérité("Lou est beau");
        assertTrue(vérité.isValeur() && vérité.isValeurSecondaire());
    }

}
