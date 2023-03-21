package com.greselle.structural.composite.challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

    private String name;
    private String department;
    private List<Faculty> faculties;

    public Supervisor(String name, String department) {
        this.name = name;
        this.department = department;
        this.faculties = new ArrayList<>();
    }

    public void add(Faculty professor) {
        faculties.add(professor);
    }

    public void remove(Faculty professor) {
        faculties.remove(professor);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + " and position: " + department;
    }
}
