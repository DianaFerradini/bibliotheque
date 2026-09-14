package com.ism.services;

import com.ism.domain.Livre;
import com.ism.domain.StatutEmprunt;

import java.util.Date;

import com.ism.domain.Emprunt;

public final class Initialisation {
    private Initialisation() {}

    public static void initLivres() {
        for (int i = 0; i < 5; i++) {
            int id = 0;
            String titre = "";
            String auteur = "";
            String isbn = "";
            boolean disponible = false;
            switch (i) {
                case 0:
                    id = 1;
                    titre = "Le Petit Prince";
                    auteur = "Antoine de Saint-Exupéry";
                    isbn = "978-2070612758";
                    break;

                case 1:
                    id = 2;
                    titre = "L'Étranger";
                    auteur = "Albert Camus";
                    isbn = "978-2070360024";
                    break;

                case 2:
                    id = 3;
                    titre = "1984";
                    auteur = "George Orwell";
                    isbn = "978-2070368228";
                    break;

                case 3:
                    id = 4;
                    titre = "Cent ans de solitude";
                    auteur = "Gabriel García Márquez";
                    isbn = "978-2070369218";
                    break;

                case 4:
                    id = 5;
                    titre = "Les Misérables";
                    auteur = "Victor Hugo";
                    isbn = "978-2070409181";
                    break;

                default:
                    break;
            }
            Livre livre = new Livre(id, titre, auteur, isbn, disponible);
            LivreService.add(livre);
        }
    }

    public static void initEmprunts() {
        for (int i = 0; i < 5; i++) {
            int id = 0;
            String nomEmprunteur = "";
            Date dateEmprunt = null;
            Date dateRetourPrevue = null;
            Livre livre = null;
            StatutEmprunt statut = StatutEmprunt.EN_COURS;
            switch (i) {
                case 0:
                    id = 1;
                    nomEmprunteur = "Awa Fall";
                    dateEmprunt = new Date(14/9/2026);
                    dateRetourPrevue = new Date(14/10/2026);
                    livre = LivreService.getAll().get(i);
                    break;

                case 1:
                    id = 2;
                    nomEmprunteur = "Adama Ndiaye";
                    dateEmprunt = new Date(14/9/2026);
                    dateRetourPrevue = new Date(14/10/2026);
                    livre = LivreService.getAll().get(i);
                    break;

                case 2:
                    id = 3;
                    nomEmprunteur = "Doudou Diene";
                    dateEmprunt = new Date(14/9/2026);
                    dateRetourPrevue = new Date(14/10/2026);
                    livre = LivreService.getAll().get(i);
                    break;

                case 3:
                    id = 4;
                    nomEmprunteur = "Ami Tall";
                    dateEmprunt = new Date(14/9/2026);
                    dateRetourPrevue = new Date(14/10/2026);
                    livre = LivreService.getAll().get(i);
                    break;

                case 4:
                    id = 5;
                    nomEmprunteur = "Dieyna Bah";
                    dateEmprunt = new Date(14/9/2026);
                    dateRetourPrevue = new Date(14/10/2026);
                    livre = LivreService.getAll().get(i);
                    break;

                default:
                    break;
            }
            Emprunt emprunt = new Emprunt(id, nomEmprunteur, dateEmprunt, dateRetourPrevue, livre, statut);
            EmpruntService.add(emprunt);
        }
    }
}
