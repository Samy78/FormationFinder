package com.formationfinder.insat.controllers;

import com.formationfinder.insat.models.Formateur;
import com.formationfinder.insat.models.Formation;
import com.formationfinder.insat.models.FormationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Samy on 09/02/2017.
 */
@RestController
public class FormationController {

    @Autowired
    private FormationDAO formationDAO;

    @RequestMapping(value="/createFormation", method = RequestMethod.POST,headers="Accept=application/json")
    @ResponseBody
    public Formation create(
            String nom,
            String domaine,
            String lieu,
            String date,
            String prix,
            String qrcode,
            String coef,
            int idformateur,
            int idlieu) {
        Formation f = null;
        try {
            f = new Formation(nom,domaine,lieu,date,prix,qrcode,coef,idformateur,idlieu);
            formationDAO.save(f);
        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return f;
    }

    @RequestMapping(value="/deleteFormation", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public String del(Long idformation) {
        Formation f = null;
        // Long idformateur=null;
        try {
            f = new Formation();
            f=formationDAO.findOne(idformation);
            formationDAO.delete(f);
        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return "Formateur supprimé id(" + idformation+ ")";
    }

    @RequestMapping(value="/updateFormation", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public String update(int idformation,String nom,
                         String domaine,
                         String lieu,
                         String date,
                         String prix,
                         String qrcode,
                         String coef,
                         int idformateur,
                         int idlieu) {
        Formation f = null;
        try {
            f = new Formation(idformation,nom,domaine,lieu,date,prix,qrcode,coef,idformateur,idlieu);

            formationDAO.save(f);
        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return "Formateur modifié id(" + idformateur+ ")";
    }

    @RequestMapping(value="/getallFormation", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public Iterable<Formation> fetchall() {

        // Long idformateur=null;
        Iterable<Formation> formateurs =null;
        try {
            formateurs = formationDAO.findAll();

        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();

        }
        return formateurs;
    }
    @RequestMapping(value="/getFormation", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public Iterable<Formation> findByformateur(int idformateur) {

        // Long idformateur=null;
        Iterable<Formation> formations =null;
        try {
            formations = formationDAO.findByIdformateur(idformateur);

        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();

        }
        return formations;
    }
}
