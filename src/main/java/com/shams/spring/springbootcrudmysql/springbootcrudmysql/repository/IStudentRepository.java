package com.shams.spring.springbootcrudmysql.springbootcrudmysql.repository;

import com.shams.spring.springbootcrudmysql.springbootcrudmysql.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {
}
