package com.example.passport.managment.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.passport.managment.system.Entity.PersonDetails;

@Repository
public interface PersonRepo extends JpaRepository<PersonDetails,Long> {

}
