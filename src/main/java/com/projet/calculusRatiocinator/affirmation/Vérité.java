package com.projet.calculusRatiocinator.affirmation;

import java.util.List;

public final class Vérité extends Affirmation{
    private boolean valeur;
    public Vérité(String enconcé) {
        super(enconcé, true);
    }
}
