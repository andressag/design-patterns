
interface DisplayModule {
    public void display();
}

class Monitor implements DisplayModule {
    public void display() {
        System.out.println("display through Monitor");
    }
}

class Project implements DisplayModule {

    @Override
    public void display() {
        System.out.println("display through Project");
    }
}

public class Computer {
    DisplayModule dm;
    public void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setDisplayModule(new Monitor());
        computer.display();

        computer.setDisplayModule(new Project());
        computer.display();
    }
}
