package com.ksolves.controller;

public class Home {
    String name;
    String course;
    String Qualification;
    public Home() { }

    public Home(String name, String course, String qualification) {
        this.name = name;
        this.course = course;
        Qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}
