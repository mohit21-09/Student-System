package com.mohit.studentsystem.service;

import com.mohit.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
public Student saveStudent(Student student);
public List<Student> getAllStudents();

}
