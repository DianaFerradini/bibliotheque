package com.ism.services;

import java.util.ArrayList;

import com.ism.domain.Emprunt;

public final class EmpruntService {
    private static ArrayList<Emprunt> emprunts = new ArrayList<>();

    private EmpruntService() {
    }

    public static ArrayList<Emprunt> getAll() {
        return emprunts;
    }

    public static void add(Emprunt nouveau) {
        emprunts.add(nouveau);
    }
}
