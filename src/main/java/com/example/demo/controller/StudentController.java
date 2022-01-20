package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping
    public List<Student> getstu(){
        System.out.println("calling getall");
        return studentService.getstu();
    }
    @PostMapping("")
    public Student add(@RequestBody Student student){
        System.out.println("calling add method");
        return studentService.add(student);
    }
    @GetMapping("/{num}")
    public Student get(@PathVariable int num){
        return studentService.find(num);
    }
    @GetMapping("/cal")
    public double cal(@RequestParam int a,@RequestParam int b){
        double hours=a/60,rem,single;
        rem=hours%12;
        single=((int)hours/12)*2*12+rem;
        return single;
    }

}
