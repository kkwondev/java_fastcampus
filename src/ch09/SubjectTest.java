package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentKang = new Student(1, "강경원");
        studentKang.setKoreaSubject("국어",100);
        studentKang.setMathSubject("수학", 100);

        Student studentKim = new Student(1, "kim");
        studentKim.setKoreaSubject("국어",50);
        studentKim.setMathSubject("수학", 100);

        studentKang.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
