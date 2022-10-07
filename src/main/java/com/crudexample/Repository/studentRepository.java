package com.crudexample.Repository;

import org.springframework.data.repository.CrudRepository;

import com.crudexample.entity.student;

public interface studentRepository extends CrudRepository<student, Long> {

}
