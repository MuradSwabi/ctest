package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getstu(){
        return studentRepository.findAll();
    }
    public Student add(Student student){
        return studentRepository.save(student);

    }
    public Student find(int id){

        return studentRepository.findById(id).orElse(null);
    }
}
