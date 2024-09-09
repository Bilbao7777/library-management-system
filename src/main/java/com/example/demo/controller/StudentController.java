package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/students")
public class StudentController {
    //insert endpoint/insert api.

    private final StudentService studentService;
    // using the constructor here to use the user service.
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

        Student s = studentService.save(student);
        return ResponseEntity.ok(s);


    }

    //url http://localhost:8080/students
    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {

        return ResponseEntity.ok(studentService.getAllStudents());
    }

    // url http://localhost:8080/students/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long id) {
        String result = studentService.deleteStudent(id);
        return ResponseEntity.ok(result);
    }

    //partial update is patch. Full update is put.
    // doing partial
    // url http://localhost:8080/students
    @PatchMapping("/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return ResponseEntity.ok(studentService.updateStudent(id, student));
    }

    //let's make  API for full update. Put method
    @PutMapping("/{id}")
    public ResponseEntity<String> updatePutStudent(@PathVariable Long id, @RequestBody Student student) {
        return ResponseEntity.ok(studentService.updatePutStudent(id, student));
    }

    @GetMapping("/male")
    public ResponseEntity<List<Student>> getMaleStudents(){
        return ResponseEntity.ok(studentService.getMaleStudents());
    }

    //url http//localhost:8080/students/address/{}
    @GetMapping("/address/{state}")
    public ResponseEntity<List<Student>> getStudentsByState(@PathVariable("state") String state){
        return ResponseEntity.ok(studentService.getStudentsByState(state));
    }
}
