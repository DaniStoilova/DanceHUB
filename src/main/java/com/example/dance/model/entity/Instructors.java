package com.example.dance.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Instructors extends BaseEntity{

    @Column(nullable = false,unique = true)
    private String name;

    @OneToMany(mappedBy = "instructors")
    private List<DanceClasses> danceClasses;

    @ManyToOne
    private Scheduling schedule;

    public Instructors() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<DanceClasses> getDanceClasses() {
        return danceClasses;
    }

    public void setDanceClasses(List<DanceClasses> danceClasses) {
        this.danceClasses = danceClasses;
    }
}
