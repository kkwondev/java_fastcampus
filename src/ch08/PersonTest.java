package ch08;

public class PersonTest {
    public static void main(String[] args) {
        Person tomas = new Person();
        tomas.gender = "남성";
        tomas.weight = 78;
        tomas.age = 37;
        tomas.height = 180;
        tomas.name = "Tomas";

        System.out.println(tomas.personInfo());
    }
}
