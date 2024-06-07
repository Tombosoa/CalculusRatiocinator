package com.projet.CalculusRatiocinator.composition.affirmation;

import com.projet.calculusRatiocinator.affirmation.SimpleAffirmation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleAffirmationTest {
    @Test
    void une_simple_affirmation_peut_etre_vrai_ou_fausse(){
        SimpleAffirmation simpleAffirmation = new SimpleAffirmation("Lou est généreux");
        assertTrue(simpleAffirmation.isValeur() != simpleAffirmation.isValeurSecondaire());
    }
}
