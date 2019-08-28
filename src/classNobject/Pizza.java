package classNobject;

public class Pizza {

    public String pizzaType;
    public double price;
    public boolean isHandMade;
    public char size;
    public String topping;

    public Pizza (){
        this.pizzaType = "Tossed Pizza";
        this.price = 10.99;
        this.isHandMade = true;
        this.size = 'L';
        this.topping  = "Your Choice";

    }

    public Pizza(String pizzaType, double price, boolean isHandMade, char size, String topping) {
        this.pizzaType = pizzaType;
        this.price = price;
        this.isHandMade = isHandMade;
        this.size = size;
        this.topping = topping;
    }
}

