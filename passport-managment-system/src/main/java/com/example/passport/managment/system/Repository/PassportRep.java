package com.example.passport.managment.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.passport.managment.system.Entity.PassportDetails;

@Repository
public interface PassportRep  extends JpaRepository<PassportDetails,Long>{

}
