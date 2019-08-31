package keywords;

public class Computer {
    int ramSize;

    public Computer() {}

    public Computer(int ramSize) {
        this.ramSize = ramSize;

    }

    public void assembleComputer() {
        System.out.println("Parts assembled in USA");
    }

    public void assembleMonitor() {
        System.out.println("Computer Monitor is Retina Screen");
    }
}
