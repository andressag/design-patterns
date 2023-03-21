package com.greselle.structural.composite.challenge;

public interface Department {
    void getFaculty();
}

class ComputerScience implements Department {

    Professor professor1;
    Professor professor2;
    Professor professor3;

    public ComputerScience(Professor professor1, Professor professor2, Professor professor3) {
        this.professor1 = professor1;
        this.professor2 = professor2;
        this.professor3 = professor3;
    }

    @Override
    public void getFaculty() {

    }
}

class Mathematics implements Department {

    Professor professor1;
    Professor professor2;

    public Mathematics(Professor professor1, Professor professor2) {
        this.professor1 = professor1;
        this.professor2 = professor2;
    }

    @Override
    public void getFaculty() {

    }
}