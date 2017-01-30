package com.formationfinder.insat.models;

import javax.persistence.*;

/**
 * Created by Samy on 19/01/2017.
 */
@Entity
@Table(name="formateur")
public class Formateur {
    @Id
    private Long idformateur;

    private String nom;
    private String prenom;
    private String dateNaissance;
    private String email;
    private String telephone;
    private String specialite;
    private String note;
    private String dossier;
    private String motDePasse;
    private Integer active;
    private String cin;

    public Formateur(){}

    public Formateur(String nom, String prenom, String dateNaissance, String email, String telephone, String specialite, String note, String dossier, String motDePasse, Integer active, String cin) {
        //this.idformateur=idformateur;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
        this.note = note;
        this.dossier = dossier;
        this.motDePasse = motDePasse;
        this.active = active;
        this.cin = cin;
    }
    public Formateur(Long idformateur,String nom, String prenom, String dateNaissance, String email, String telephone, String specialite, String note, String dossier, String motDePasse, Integer active, String cin) {
        this.idformateur=idformateur;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
        this.note = note;
        this.dossier = dossier;
        this.motDePasse = motDePasse;
        this.active = active;
        this.cin = cin;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idformateur")
    public Long getIdformateur() {
        return idformateur;
    }

    public void setIdformateur(Long idformateur) {
        this.idformateur = idformateur;
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
    @Column(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "date_naissance")
    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "specialite")
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "dossier")
    public String getDossier() {
        return dossier;
    }

    public void setDossier(String dossier) {
        this.dossier = dossier;
    }

    @Basic
    @Column(name = "mot_de_passe")
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Basic
    @Column(name = "active")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Basic
    @Column(name = "cin")
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Formateur formateur = (Formateur) o;

        if (idformateur != formateur.idformateur) return false;
        if (nom != null ? !nom.equals(formateur.nom) : formateur.nom != null) return false;
        if (prenom != null ? !prenom.equals(formateur.prenom) : formateur.prenom != null) return false;
        if (dateNaissance != null ? !dateNaissance.equals(formateur.dateNaissance) : formateur.dateNaissance != null)
            return false;
        if (email != null ? !email.equals(formateur.email) : formateur.email != null) return false;
        if (telephone != null ? !telephone.equals(formateur.telephone) : formateur.telephone != null) return false;
        if (specialite != null ? !specialite.equals(formateur.specialite) : formateur.specialite != null) return false;
        if (note != null ? !note.equals(formateur.note) : formateur.note != null) return false;
        if (dossier != null ? !dossier.equals(formateur.dossier) : formateur.dossier != null) return false;
        if (motDePasse != null ? !motDePasse.equals(formateur.motDePasse) : formateur.motDePasse != null) return false;
        if (active != null ? !active.equals(formateur.active) : formateur.active != null) return false;
        if (cin != null ? !cin.equals(formateur.cin) : formateur.cin != null) return false;

        return true;
    }

    //@Override
    /*public Long hashCode() {
        Long result = idformateur;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (dateNaissance != null ? dateNaissance.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (specialite != null ? specialite.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (dossier != null ? dossier.hashCode() : 0);
        result = 31 * result + (motDePasse != null ? motDePasse.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (cin != null ? cin.hashCode() : 0);
        return result;*/
    //}
}

