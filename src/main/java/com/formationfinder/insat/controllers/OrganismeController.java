package com.formationfinder.insat.controllers;


import com.formationfinder.insat.models.Organisme;
import com.formationfinder.insat.models.OrganismeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Samy on 09/02/2017.
 */

@RestController
public class OrganismeController {

    @Autowired
    private OrganismeDAO OrganismeDAO;

    @RequestMapping(value="/createOrganisme", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public Organisme create(
            String nom,
            String adresse,
            String capacite,
            String email,
            String motDePasse,
            String telephone,
            String region,
            String gouvernerat) {
        Organisme f = null;
        try {
            f = new Organisme(nom,adresse,capacite,email,motDePasse,telephone,region,gouvernerat);
            OrganismeDAO.save(f);
        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return f;
    }
    @RequestMapping(value="/deleteOrganisme", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public String del(Long idLieu) {
        Organisme f = null;
        // Long idformateur=null;
        try {
            f = new Organisme();
            f= OrganismeDAO.findOne(idLieu);
            OrganismeDAO.delete(f);
            return "Organisme supprimé id(" + idLieu+ ")";
        }
        catch (Exception ex) {
             return "Error Deleting the Organism: " + ex.toString();
        }

    }
    @RequestMapping(value="/updateOrganisme", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public String update(Long idLieu,
            String nom,
            String adresse,
            String capacite,
            String email,
            String telephone,
            String motDePasse,
            String region,
            String gouvernerat) {
        Organisme f = null;
        try {
            f = new Organisme(idLieu,nom,adresse,capacite,email, telephone, motDePasse,region,gouvernerat);

            OrganismeDAO.save(f);
        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return "Organisme modifié id(" + idLieu+ ")";
    }

    @RequestMapping(value="/getallOrganisme", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public Iterable<Organisme> fetchall() {

        // Long idformateur=null;
        Iterable<Organisme> Organismes =null;
        try {
            Organismes = OrganismeDAO.findAll();
            return Organismes;
        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();

        }
return null;
    }

    @RequestMapping(value="/AuthentificationOrganisme", method = RequestMethod.POST,headers="Accept=application/json")
    @ResponseBody
    public Organisme authentification(String email, String motDepasse) {
        Organisme f;

        boolean bool=false;
        try {
            f = OrganismeDAO.findByemail(email);
            if( f.getMotDePasse().equals(motDepasse))
            {bool=true;return f;}
            else
            {bool=false;}

        }
        catch (Exception ex) {
            // return "Error creating the user: " + ex.toString();
        }
        return null;
    }


}
