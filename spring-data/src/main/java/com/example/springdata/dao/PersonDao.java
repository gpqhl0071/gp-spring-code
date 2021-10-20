package com.example.springdata.dao;

import com.example.springdata.bean.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonDao extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {
}
