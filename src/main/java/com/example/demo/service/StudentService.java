package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Value("${message}")
    private String msg;
    @Value("${your.state}")
    private String state;

    @Value("${city}")
    private String city;

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        System.out.println("Your msg is "+msg);
        System.out.println("Your state is: "+state);
        System.out.println("Your city is " + city);

//        List<Student> students =  studentRepository.findAll();
//        List<Student> student = new ArrayList<>();
////        students.forEach(student->{
//            StudentDto studentDto = new StudentDto();
//            BeanUtils.copyProperties(student, studentDto);
//            studentDtos.add(studentDto);
//        });
        return studentRepository.findAll();
    }

    public String deleteStudent(Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            //studentRepository.deleteById(id);

            return "Student having id " + id + " deleted successfully.";
        }
        return "Student having id " + id + "  does not exit.";
    }

    public String updateStudent(Long id, Student student) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student existingStudent = studentOptional.get();
            if (student.getFullName() != null) {
                existingStudent.setFullName(student.getFullName());
            }
            if (student.getEmail() != null) {
                existingStudent.setEmail(student.getEmail());
            }
            if (student.getAddress() != null) {
                existingStudent.setAddress(student.getAddress());
            }

            if (student.getGender() != null) {
                existingStudent.setGender(student.getGender());
            }

            if (student.getPhone() != null) {
                existingStudent.setPhone(student.getPhone());
            }

            studentRepository.save(existingStudent);

            return "Student having id " + id + " updated successfully.";
        }
        return "Student id not found.";
    }

    public String updatePutStudent(Long id, Student student) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student existingStudent = studentOptional.get();
            existingStudent.setFullName(student.getFullName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setPhone(student.getPhone());
            existingStudent.setAddress(student.getAddress());
            existingStudent.setGender(student.getGender());
            studentRepository.save(existingStudent);

            return "Student having id " + id + " updated successfully.";
        }
        return "Student id not found.";
    }

    public List<Student> getMaleStudents() {
        return studentRepository.getMaleStudents();
    }

    public List<Student> getStudentsByState(String state) {
        return studentRepository.getStudentsByState(state);
    }

    //creating objects using @Builder.
    public void test (){
        Student student1 = Student.builder()
                .id(123)
                .build();
        Student student2 = Student.builder()
                .id(456)
                .fullName("Harry Prasad")
                .build();
    }
}
