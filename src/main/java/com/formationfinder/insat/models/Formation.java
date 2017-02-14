package com.formationfinder.insat.models;

import javax.persistence.*;

/**
 * Created by Samy on 09/02/2017.
 */
@Entity
@Table(name="formation")
public class Formation {
    @Id
    private int idformation;
    private String nom;
    private String domaine;
    private String lieu;
    private String date;
    private String prix;
    private String qrcode;
    private String coef;
    private int idformateur;
    private int idlieu;

    public Formation(int idformation, String nom, String domaine, String lieu, String date, String prix, String qrcode, String coef, int idformateur, int idlieu) {
        this.idformation = idformation;
        this.nom = nom;
        this.domaine = domaine;
        this.lieu = lieu;
        this.date = date;
        this.prix = prix;
        this.qrcode = qrcode;
        this.coef = coef;
        this.idformateur = idformateur;
        this.idlieu = idlieu;
    }

    public Formation(String nom, String domaine, String lieu, String date, String prix, String qrcode, String coef, int idformateur, int idlieu) {
        this.nom = nom;
        this.domaine = domaine;
        this.lieu = lieu;
        this.date = date;
        this.prix = prix;
        this.qrcode = qrcode;
        this.coef = coef;
        this.idformateur = idformateur;
        this.idlieu = idlieu;
    }

    public Formation() {
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idformation")
    public int getIdformation() {
        return idformation;
    }

    public void setIdformation(int idformation) {
        this.idformation = idformation;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "domaine")
    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }


    @Basic
    @Column(name = "lieu")
    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "prix")
    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "qrcode")
    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    @Basic
    @Column(name = "coef")
    public String getCoef() {
        return coef;
    }

    public void setCoef(String coef) {
        this.coef = coef;
    }

    @Basic
    @Column(name = "formateur_idformateur")
    public int getIdformateur() {
        return idformateur;
    }

    public void setIdformateur(int idformateur) {
        this.idformateur = idformateur;
    }
    @Basic
    @Column(name = "Lieu_idLieu")
    public int getIdlieu() {
        return idlieu;
    }

    public void setIdlieu(int idlieu) {
        this.idlieu = idlieu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Formation formation = (Formation) o;

        if (idformation != formation.idformation) return false;
        if (nom != null ? !nom.equals(formation.nom) : formation.nom != null) return false;
        if (domaine != null ? !domaine.equals(formation.domaine) : formation.domaine != null) return false;
        if (lieu != null ? !lieu.equals(formation.lieu) : formation.lieu != null) return false;
        if (date != null ? !date.equals(formation.date) : formation.date != null) return false;
        if (prix != null ? !prix.equals(formation.prix) : formation.prix != null) return false;
        if (qrcode != null ? !qrcode.equals(formation.qrcode) : formation.qrcode != null) return false;
        if (coef != null ? !coef.equals(formation.coef) : formation.coef != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idformation;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (domaine != null ? domaine.hashCode() : 0);
        result = 31 * result + (lieu != null ? lieu.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (prix != null ? prix.hashCode() : 0);
        result = 31 * result + (qrcode != null ? qrcode.hashCode() : 0);
        result = 31 * result + (coef != null ? coef.hashCode() : 0);
        return result;
    }
}
