package com.greselle.solid.dependencyInjection;
 interface Service {
    void write(String message);
}

class ServiceA implements Service {

    @Override
    public void write(String message) {
        System.out.println("Hello");
    }

}

public class Client {
     private Service service;

     // injects via the constructor
    public Client(Service service) {
        this.service = service;
    }

    public void doSomething() {
        service.write("message");
    }

    public static void main(String[] args) {
        Service serviceA = new ServiceA(); // the injector
        Client client =  new Client(serviceA); // injects via the constructor
        client.doSomething();
    }
}