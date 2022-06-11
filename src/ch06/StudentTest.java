package ch06;

public class StudentTest {
    public static void main(String[] args) {
//        default 생성자 일경우.
        Student studentKim = new Student();
        studentKim.grade = 2;
        studentKim.studentName = "kim";
        studentKim.studentNumber = 10000;
        System.out.println(studentKim.showStudentInfo());

//        생성자를 생성해줬을 경우
        Student studentKang = new Student(1000, "강경원",1);
        System.out.println(studentKang.showStudentInfo());
    }
}
