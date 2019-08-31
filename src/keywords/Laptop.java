package keywords;

public class Laptop extends Computer {

    public Laptop(int ramSize){
        super(8);
        System.out.println(ramSize);

    }

    public void displaySize(){
        super.assembleMonitor();
        System.out.println("15 inch");
    }




}
