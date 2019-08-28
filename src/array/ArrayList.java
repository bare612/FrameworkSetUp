package array;

import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] employeeID = new int [2];
        System.out.println("Enter Your ID:");
        for(int i = 0; i <employeeID.length; i++) {
            employeeID[i] = sc.nextInt();

        }
        for(int i =0; i <2; i ++) {
            System.out.println(employeeID[i]);

        }
    }
}
