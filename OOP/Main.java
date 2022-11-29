public class Main {

    public static void main(String[] args) {

        Car car = new Car();
       // car.make = "Porsche";

        //GETTER
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());

        //SETTER
        car.setModel("Carrera");
        car.setMake("Porsche");
        car.setConvertible(true);
        car.setDoors(4);
        car.setColor("Red");

        car.describeCar();
    }
}
