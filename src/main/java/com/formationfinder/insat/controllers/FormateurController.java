package com.formationfinder.insat.controllers;

import com.formationfinder.insat.models.Formateur;
import com.formationfinder.insat.models.FormateurDAO;
import com.sun.jersey.core.header.FormDataContentDisposition;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by Samy on 26/01/2017.
 */
@RestController
public class FormateurController {
    @Autowired
    private FormateurDAO FormateurDAO;
    //private static final String UPLOAD_FOLDER = "c:/uploadedFiles/";
// @Consumes(MediaType.MULTIPART_FORM_DATA)

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/createFormateur", method = RequestMethod.POST,headers="Accept=application/json")
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
            String active,
            String cin) {
        Formateur f = null;
        try {

// check if all form parameters are provided
            //if (uploadedInputStream == null || fileDetail == null)
               // return Response.status(400).entity("Invalid form data").build();
            // create our destination folder, if it not exists
           /* try {
                createFolderIfNotExists(UPLOAD_FOLDER);
            } catch (SecurityException se) {
                /*return Response.status(500)
                        .entity("Can not create destination folder on server")
                        .build();*/
          /*  }
            String uploadedFileLocation = UPLOAD_FOLDER + fileDetail.getFileName();
            try {
                saveToFile(uploadedInputStream, uploadedFileLocation);
            } catch (IOException e) {
               // return Response.status(500).entity("Can not save file").build();
            }
          //  return Response.status(200)
            //        .entity("File saved to " + uploadedFileLocation).build();
*/
Integer activee=parseInt(active);
            f = new Formateur(nom,prenom,dateNaissance,email,telephone,specialite,note,dossier,motDePasse,activee,cin);
            FormateurDAO.save(f);
        }
        catch (Exception ex) {
           // return "Error creating the user: " + ex.toString();
        }
        return f;
    }
  /*  private void saveToFile(InputStream inStream, String target)
            throws IOException {
        OutputStream out = null;
        int read = 0;
        byte[] bytes = new byte[1024];
        out = new FileOutputStream(new File(target));
        while ((read = inStream.read(bytes)) != -1) {
            out.write(bytes, 0, read);
        }
        out.flush();
        out.close();
    }
    /**
     * Creates a folder to desired location if it not already exists
     *
     * @param dirName
     *            - full path to the folder
     * @throws SecurityException
     *             - in case you don't have permission to create the folder
     */
  /*  private void createFolderIfNotExists(String dirName)
            throws SecurityException {
        File theDir = new File(dirName);
        if (!theDir.exists()) {
            theDir.mkdir();
        }
    }*/

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

    @RequestMapping(value="/AuthentificationFormateur", method = RequestMethod.POST,headers="Accept=application/json")
    @ResponseBody
    public Formateur authentification(String email, String motDepasse) {
        Formateur f;

        boolean bool=false;
        try {
            f = FormateurDAO.findByemail(email);
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
