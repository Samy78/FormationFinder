package com.formationfinder.insat.models;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Samy on 26/01/2017.
 */
@Transactional
public interface FormateurDAO extends CrudRepository<Formateur,Long>{

   public Formateur findFormateurByEmail(String email);

}
