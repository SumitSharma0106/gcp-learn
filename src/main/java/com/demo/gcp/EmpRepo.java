package com.demo.gcp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer> {

    @Query(nativeQuery = true,value = "select count(*) from emp where age >=30")
    int getEmpGreaterThan30();




}
