package com.ism.domain;

import java.util.Date;

public final class Emprunt extends AbstractEntity{
    private String nomEmprunteur;
    private Date dateEmprunt;
    private Date dateRetourPrevue;
    private Livre livre;
    private StatutEmprunt statut;

    public Emprunt() {
    }
    
    public Emprunt(int id, String nomEmprunteur, Date dateEmprunt, Date dateRetourPrevue, Livre livre,
            StatutEmprunt statut) {
        super(id);
        this.nomEmprunteur = nomEmprunteur;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        this.livre = livre;
        this.statut = statut;
    }

    public String getNomEmprunteur() {
        return nomEmprunteur;
    }

    public void setNomEmprunteur(String nomEmprunteur) {
        this.nomEmprunteur = nomEmprunteur;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetourPrevue() {
        return dateRetourPrevue;
    }

    public void setDateRetourPrevue(Date dateRetourPrevue) {
        this.dateRetourPrevue = dateRetourPrevue;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public StatutEmprunt getStatut() {
        return statut;
    }

    public void setStatut(StatutEmprunt statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", emprunteur : " + nomEmprunteur + ", date d'emprunt : " + dateEmprunt
                + ", date de retour prévue=" + dateRetourPrevue + ", livre : " + livre.getTitre() + ", statut : " + statut;
    }
}
