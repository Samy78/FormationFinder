package com.formationfinder.insat.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Samy on 09/02/2017.
 */
public interface OrganismeDAO extends CrudRepository<Organisme,Long> {
    Organisme findByemail (String email);

}
