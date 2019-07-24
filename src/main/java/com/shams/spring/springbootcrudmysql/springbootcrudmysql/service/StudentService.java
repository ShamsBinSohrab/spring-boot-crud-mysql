package com.shams.spring.springbootcrudmysql.springbootcrudmysql.service;

import com.shams.spring.springbootcrudmysql.springbootcrudmysql.model.Student;
import com.shams.spring.springbootcrudmysql.springbootcrudmysql.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository studentRepository;

    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
