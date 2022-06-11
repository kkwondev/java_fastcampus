package ch06;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;


    public Student(){}
    // 생성자 : 안만들경우, 자동으로 빈 걸로 생성해줌.
    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }
    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다." ;
    }
}
