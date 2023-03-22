package com.greselle.structural.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> types = new HashMap<>();

    public int totalObjectsCreated() {
        return types.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface robot;

        if (types.containsKey(robotType)) {
//            System.out.println("# Getting instance: " + robotType);
            robot = types.get(robotType);
        } else {
            switch (robotType) {
                case "King" -> {
                    System.out.println("*** Creating NEW King Robot");
                    robot = new Robot("King");
                    types.put("King", robot);
                }
                case "Queen" -> {
                    System.out.println("*** Creating NEN Queen Robot");
                    robot = new Robot("Queen");
                    types.put("Queen", robot);
                }
                default -> throw new Exception("Can only create King or Queen Robots");
            }
        }
        return robot;
    }
}
