package keywords;

public class Calculator {

    public static void main(String[] args) {
        int number = 10;
        try {
            int result = 10 / 0; // if you divide by zero you have to use the exception - try,catch block
            System.out.println(result);  // and it is called exception handling
        }catch(Exception ex) { // ex is just variable it could be you name or what ever
            System.out.println("You can not divide a number by zero");
         //   ex.getStackTrace();
        }
        System.out.println("You made it");
    }

}