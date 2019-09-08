package array;

public class Student {

    private int studentId;
    private int studentName;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, int studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentName() {
        return studentName;
    }

    public void setStudentName(int studentName) {
        this.studentName = studentName;
    }
}

