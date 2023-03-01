public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car("Honda", 15000);
        Boat titanic = new Boat("Titanic", 400000);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}

