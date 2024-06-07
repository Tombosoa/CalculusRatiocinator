package com.projet.calculusRatiocinator.affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Getter
public sealed abstract class Affirmation permits
        Mensonge, Vérité, SimpleAffirmation {
    protected final String enconcé;
    protected final boolean valeur;
}
