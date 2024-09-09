package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //native query.
    //Select * from student where gender="M"
    @Query(value = "Select * from student where gender ='M'", nativeQuery = true)
    public List<Student> getMaleStudents();

    @Query(value = "Select * from student where address = :state", nativeQuery = true)
    List<Student> getStudentsByState(String state);
}
