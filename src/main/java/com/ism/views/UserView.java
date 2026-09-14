package com.ism.views;

import java.util.ArrayList;

import com.ism.domain.Emprunt;
import com.ism.domain.Livre;

public final class UserView {
    private UserView() {}

    public static void afficherLivres(ArrayList<Livre> livres) {
        if (livres.isEmpty()) {
            System.out.println("Pas de livres enregistrés");
        } else {
            for (Livre livre : livres) {
                livre.toString();
            }
        }
    }

    public static void afficherEmprunts(ArrayList<Emprunt> emprunts) {
        if (emprunts.isEmpty()) {
            System.out.println("Pas d'emprunts enregistrés");
        } else {
            for (Emprunt emprunt : emprunts) {
                emprunt.toString();
            }
        }
    }
}
