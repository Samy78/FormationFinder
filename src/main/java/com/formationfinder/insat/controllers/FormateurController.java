package com.formationfinder.insat.controllers;

import com.formationfinder.insat.models.Formateur;
import com.formationfinder.insat.models.FormateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Samy on 26/01/2017.
 */
@RestController
public class FormateurController {
    @Autowired
    private FormateurDAO FormateurDAO;

    @RequestMapping(value="/createFormateur", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public Formateur create(
            String nom,
            String prenom,
            String dateNaissance,
            String email,
            String telephone,
            String specialite,
            String note,
            String dossier,
            String motDePasse,
            Integer active,
            String cin) {
        Formateur f = null;
       // Long idformateur=null;
        try {
            f = new Formateur(nom,prenom,dateNaissance,email,telephone,specialite,note,dossier,motDePasse,active,cin);
            FormateurDAO.save(f);
        }
        catch (Exception ex) {
           // return "Error creating the user: " + ex.toString();
        }
        return f;
    }

    @RequestMapping(value="/deleteFormateur", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public String del(Long idformateur) {
        Formateur f = null;
        // Long idformateur=null;
        try {
            f = new Formateur();
            f=FormateurDAO.findOne(idformateur);
            FormateurDAO.delete(f);
        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return "Formateur supprimé id(" + idformateur+ ")";
    }

    @RequestMapping(value="/updateFormateur", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public String update(Long idformateur,String nom,
                         String prenom,
                         String dateNaissance,
                         String email,
                         String telephone,
                         String specialite,
                         String note,
                         String dossier,
                         String motDePasse,
                         Integer active,
                         String cin) {
        Formateur f = null;
        // Long idformateur=null;
        try {
            f = new Formateur(idformateur,nom,prenom,dateNaissance,email,telephone,specialite,note,dossier,motDePasse,active,cin);

            FormateurDAO.save(f);
        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return "Formateur modifié id(" + idformateur+ ")";
    }

    @RequestMapping(value="/getallFormateur", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public Iterable<Formateur> fetchall() {

        // Long idformateur=null;
        Iterable<Formateur> formateurs =null;
        try {
            formateurs = FormateurDAO.findAll();

        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();

        }
        return formateurs;
    }

    @RequestMapping(value="/AuthentificationFormateur", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public boolean authentification(String email, String motDepasse) {
        Formateur f = null;

        boolean bool=false;
        try {

            f=FormateurDAO.findFormateurByEmail(email);
            if( f.getMotDePasse()==motDepasse)
            {bool=true;}
            else
            {bool=false;}

        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return bool;
    }

}
