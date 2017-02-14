package com.formationfinder.insat.models;

import javax.persistence.*;

/**
 * Created by Samy on 09/02/2017.
 */
@Entity
@Table(name="organisme")
public class Organisme {
    @Id
    private Long idLieu;
    private String nom;
    private String adresse;
    private String capacite;
    private String email;
    private String motDePasse;
    private String telephone;
    private String region;
    private String gouvernerat;

    public Organisme(Long idLieu, String nom, String adresse, String capacite, String email, String motDePasse, String telephone, String region, String gouvernerat) {
        this.idLieu = idLieu;
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.email = email;
        this.motDePasse = motDePasse;
        this.telephone = telephone;
        this.region = region;
        this.gouvernerat = gouvernerat;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_lieu")
    public Long getIdLieu() {
        return idLieu;
    }

    public void setIdLieu(Long idLieu) {
        this.idLieu = idLieu;
    }

    public Organisme (){}

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "adresse")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "capacite")
    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
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
    @Column(name = "mot_de_passe")
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
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
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "gouvernerat")
    public String getGouvernerat() {
        return gouvernerat;
    }

    public void setGouvernerat(String gouvernerat) {
        this.gouvernerat = gouvernerat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organisme organisme = (Organisme) o;

        if (idLieu != organisme.idLieu) return false;
        if (nom != null ? !nom.equals(organisme.nom) : organisme.nom != null) return false;
        if (adresse != null ? !adresse.equals(organisme.adresse) : organisme.adresse != null) return false;
        if (capacite != null ? !capacite.equals(organisme.capacite) : organisme.capacite != null) return false;
        if (email != null ? !email.equals(organisme.email) : organisme.email != null) return false;
        if (motDePasse != null ? !motDePasse.equals(organisme.motDePasse) : organisme.motDePasse != null) return false;
        if (telephone != null ? !telephone.equals(organisme.telephone) : organisme.telephone != null) return false;
        if (region != null ? !region.equals(organisme.region) : organisme.region != null) return false;
        if (gouvernerat != null ? !gouvernerat.equals(organisme.gouvernerat) : organisme.gouvernerat != null)
            return false;

        return true;
    }

   /* @Override
    public int hashCode() {
        Long result = idLieu;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (capacite != null ? capacite.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (motDePasse != null ? motDePasse.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (gouvernerat != null ? gouvernerat.hashCode() : 0);
        return result;
    }*/

    public Organisme(String nom, String adresse, String capacite, String email, String motDePasse, String telephone, String region, String gouvernerat) {
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.email = email;
        this.motDePasse = motDePasse;
        this.telephone = telephone;
        this.region = region;
        this.gouvernerat = gouvernerat;
    }
}
