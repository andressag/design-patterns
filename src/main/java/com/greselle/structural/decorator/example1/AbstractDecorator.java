package com.greselle.structural.decorator.example1;

public abstract class AbstractDecorator extends Component {
    protected Component component;

    protected void setTheComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}

class ConcreteDecorator1 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("STATED -- ConcreteDecorator1");
        super.doJob();
        System.out.println("END -- ConcreteDecorator1");
    }
}

class ConcreteDecorator2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("STATED -- ConcreteDecorator2");
        super.doJob();
        System.out.println(" ++ OTHER INFO");
        System.out.println("END -- ConcreteDecorator2");
    }
}
