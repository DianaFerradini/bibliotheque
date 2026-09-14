package com.ism;

import java.util.ArrayList;

import com.ism.domain.Emprunt;
import com.ism.domain.Livre;
import com.ism.services.EmpruntService;
import com.ism.services.Initialisation;
import com.ism.services.LivreService;
import com.ism.views.UserView;

public class Main {
    public static void main(String[] args) {
        Initialisation.initLivres();
        Initialisation.initEmprunts();
        ArrayList<Livre> livres = LivreService.getAll();
        ArrayList<Emprunt> emprunts = EmpruntService.getAll();
        UserView.afficherLivres(livres);
        UserView.afficherEmprunts(emprunts);
    }
}