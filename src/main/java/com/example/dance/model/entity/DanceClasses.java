package com.example.dance.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "dance_classes")
public class DanceClasses extends BaseEntity {

    private String className;
    private String instructor;
    private String schedule;
    private int capacity;
    private List<UserEntity> enrolledStudents;

    public boolean enrollStudent(UserEntity users) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(users);
            return true;
        } else {
            return false;
        }
    }






}
