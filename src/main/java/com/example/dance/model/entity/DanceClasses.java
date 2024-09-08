package com.example.dance.model.entity;

import com.example.dance.model.enums.DanceEnum;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dance_classes")
public class DanceClasses extends BaseEntity {

   @Enumerated(EnumType.STRING)
    private DanceEnum className;

    @ManyToOne
    private Instructors instructors;

    @ManyToOne
    private Scheduling schedule;

    @Column(nullable = false)
    private int capacity;

    @OneToMany(mappedBy = "danceClasses")
    private List<UserEntity> enrolledStudents;

    public boolean enrollStudent(UserEntity users) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(users);
            return true;
        } else {
            return false;
        }
    }

    public DanceClasses() {
    }

    public DanceEnum getClassName() {
        return className;
    }

    public void setClassName(DanceEnum className) {
        this.className = className;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Scheduling getSchedule() {
        return schedule;
    }

    public void setSchedule(Scheduling schedule) {
        this.schedule = schedule;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<UserEntity> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<UserEntity> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
