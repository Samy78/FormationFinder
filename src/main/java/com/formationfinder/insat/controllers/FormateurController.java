package com.formationfinder.insat.controllers;

import com.formationfinder.insat.models.Formateur;
import com.formationfinder.insat.models.FormateurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Samy on 26/01/2017.
 */
@Controller
public class FormateurController {
    @Autowired
    private FormateurDAO FormateurDAO;

    @RequestMapping("/createFormateur")
    @ResponseBody
    public String create(Long idformateur,
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
            f = new Formateur(idformateur,nom,prenom,dateNaissance,email,telephone,specialite,note,dossier,motDePasse,active,cin);
            FormateurDAO.save(f);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "Formateur succesfully created! (id = " + f.getCin() + ")";
    }
}
