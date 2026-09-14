package com.ism.services;

import java.util.ArrayList;

import com.ism.domain.Livre;

public final class LivreService {
    private static ArrayList<Livre> livres = new ArrayList<>();

    private LivreService() {
    }

    public static ArrayList<Livre> getAll() {
        return livres;
    }

    public static void add(Livre nouveau) {
        livres.add(nouveau);
    }
}
