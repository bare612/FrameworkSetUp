package array;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int[] studentID = new int[10];
        Random random = new Random();
        for (int i = 0; i < studentID.length; i++) {
            studentID[i] = random.nextInt(50);
        }
        for (int i = 0; i < studentID.length; i++) {
            System.out.println(studentID[i]);
        }
    }
}

