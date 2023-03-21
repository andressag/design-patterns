package com.greselle.solid.liskovSubstitution;

class Car extends Vehicle {
    int getSpeed() {
        return 0;
    }

    int getCubicCapacity() {
        return 0;
    }
    boolean sHatchBack() {
        return true;
    }
}

class Bus extends Vehicle {
    int getSpeed() {
        return 0;
    }

    int getCubicCapacity() {
        return 0;
    }

    String getEmergencyLoc() {
        return "";
    }
}

public class Test {
    public static void main(String[] args) {

        // subtype can replace superclass without affecting the functionality of the superclass
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();

        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
}
