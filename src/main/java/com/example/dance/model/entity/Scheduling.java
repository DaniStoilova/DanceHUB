package com.example.dance.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "scheduling")
public class Scheduling extends BaseEntity{

    @Column(nullable = false)
    private String day;

    @Column(nullable = false)

    private String time;
    @OneToMany(mappedBy = "schedule")
    private List<Instructors> instructors;

    @OneToMany(mappedBy = "schedule")
    private List<UserEntity> users;



    public Scheduling() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Instructors> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructors> instructors) {
        this.instructors = instructors;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }
}
