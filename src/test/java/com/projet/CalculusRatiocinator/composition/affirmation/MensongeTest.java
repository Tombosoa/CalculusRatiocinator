package com.projet.CalculusRatiocinator.composition.affirmation;

import com.projet.calculusRatiocinator.affirmation.Mensonge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MensongeTest {
    @Test
    void la_mensonge_est_toujours_fausse(){
        Mensonge mensonge = new Mensonge("Lou est pauvre");
        assertTrue(!mensonge.isValeur());
    }
}
