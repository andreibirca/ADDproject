package com.endava.addprojectinternship2018.dao;

import com.endava.addprojectinternship2018.model.Company;
import com.endava.addprojectinternship2018.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer> {

    List<Company> findAll();

    Optional<Company> findById(int id);

    Optional<Company> findByName(String name);

    Optional<Company> findByEmail(String email);

    Optional<Company> findByUserId(int id);


}
