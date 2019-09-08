package array;

public class Main {

    public static void main(String[] args) {


        Student[] studentArray = getStudentArray(10);

        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("The student id for student " + (i+1) +
                  " is " + studentArray[i].getStudentId());
        }
    }
    public static Student[] getStudentArray(int studentSize) {
        Student[] studentArray = new Student[studentSize];
        for (int i = 0;i < studentSize;i++) {
            Student student = new Student(i+1);
            studentArray[i] = student;
        }

        return studentArray;
    }
}
