package com.greselle.structural.flyweight.example;

import java.util.Random;

public class Client {

    static String getRandomColor() {
        Random random = new Random();

        int result = random.nextInt(20);
        if (result % 2 == 0) {
            return "Red";
        }
        return "Green";
    }

    public static void main(String[] args) throws Exception {

        RobotFactory factory = new RobotFactory();

        Robot robot;

        robot = (Robot) factory.getRobotFromFactory("King");
        robot.setColor(getRandomColor());
        robot.print();

        robot = (Robot) factory.getRobotFromFactory("King");
        robot.setColor(getRandomColor());
        robot.print();

        robot = (Robot) factory.getRobotFromFactory("Queen");
        robot.setColor(getRandomColor());
        robot.print();

        robot = (Robot) factory.getRobotFromFactory("King");
        robot.setColor(getRandomColor());
        robot.print();

        robot = (Robot) factory.getRobotFromFactory("Queen");
        robot.setColor(getRandomColor());
        robot.print();

        robot = (Robot) factory.getRobotFromFactory("King");
        robot.setColor(getRandomColor());
        robot.print();

        int totalOfRobots = factory.totalObjectsCreated();
        System.out.println("Total number of Robots: " + totalOfRobots);
    }
}
