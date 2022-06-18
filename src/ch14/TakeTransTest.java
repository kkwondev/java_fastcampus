package ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student james = new Student("James",5000);
        Student tomas = new Student("James",10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        james.takeBus(bus100);
        Subway green = new Subway(2);
        tomas.takeSubway(green);

        james.showInfo();
        bus100.showBusInfo();
        tomas.showInfo();
        green.showSubwayInfo();

        bus500.showBusInfo();

    }
}
