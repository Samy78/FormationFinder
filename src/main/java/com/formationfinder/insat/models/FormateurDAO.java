package com.formationfinder.insat.models;

import org.springframework.data.repository.CrudRepository;
    import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Samy on 26/01/2017.
 */
@Transactional

public interface FormateurDAO extends CrudRepository<Formateur,Long>{
    Formateur findByemail (String email);

}
