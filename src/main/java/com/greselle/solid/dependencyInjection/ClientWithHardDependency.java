package com.greselle.solid.dependencyInjection;

// example of a hard dependency
public class ClientWithHardDependency {

    // internal reference to the service use by this client
    private ExampleService service;

    public ClientWithHardDependency() {
        // specific impl in the constructor instead of using
        service = new ExampleService();
    }

    public String greet() {
        return service.getName();
    }


    static class ExampleService {
        public String getName() {
            return "A";
        }
    }
}
