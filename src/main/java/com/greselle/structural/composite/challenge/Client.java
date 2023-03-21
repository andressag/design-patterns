package com.greselle.structural.composite.challenge;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor tekDean = new Supervisor("Mike", "Dean of tek");
        Supervisor chairMath = new Supervisor("Ana", "Chair of Math");
        Supervisor chairCompS = new Supervisor("Mary", "Chair of CS");

        Professor mathProf = new Professor("John", "Adjunct", 230);
        Professor mathProf2 = new Professor("Jack", "Associate", 233);

        Professor csProf = new Professor("Carlos", "Adjunct", 331);
        Professor csProf2 = new Professor("Jen", "Associate", 332);
        Professor csProf3 = new Professor("Ian", "FullProf", 333);

        tekDean.add(chairMath);
        tekDean.add(chairCompS);

        chairMath.add(mathProf);
        chairMath.add(mathProf2);

        chairCompS.add(csProf);
        chairCompS.add(csProf2);
        chairCompS.add(csProf3);

        System.out.println("Display Tek Dean details -> " + tekDean.getDetails());
        List<Faculty> faculties = tekDean.getFaculties();
        faculties.forEach(faculty -> System.out.println("Professor " + faculty.getDetails()));
        System.out.println("---------------------------");
        System.out.println("Display chairMath details -> " + chairMath.getDetails());
        List<Faculty> facultiesMath = chairMath.getFaculties();
        facultiesMath.forEach(faculty -> System.out.println("Professor " + faculty.getDetails()));
        System.out.println("---------------------------");
        System.out.println("Display chairCompS details -> " + chairCompS.getDetails());
        List<Faculty> facultiesCS = chairCompS.getFaculties();
        facultiesCS.forEach(faculty -> System.out.println("Professor " + faculty.getDetails()));
        System.out.println("---------------------------");
        chairCompS.remove(csProf3);
        System.out.println("Professor " + csProf3.getDetails() + " was removed");
        System.out.println("New List now is ------");
        facultiesCS.forEach(faculty -> System.out.println("Professor " + faculty.getDetails()));

    }
}
