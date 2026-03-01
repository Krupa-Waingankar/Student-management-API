package com.krupa.studentapi.Controller;

import com.krupa.studentapi.Entity.Student;
import com.krupa.studentapi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    StudentService service;
@GetMapping("/all")
    public List<Student> allStudents(){
    return service.getAllStudents();
}
@PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
}
}
