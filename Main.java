package vasi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car audi = new Car();
        Car BMW = new Car();

        audi.setColor("White");
        audi.setModel("R8");
        audi.setDoors(4);

        System.out.println("Model = " + audi.getModel());
        System.out.println("Color = " + audi.getColor());
        System.out.println("Doors = " + audi.getDoors());

        BMW.setColor("Red");
        BMW.setModel("@@@");
        BMW.setDoors(4);

        System.out.println("Model = " + BMW.getModel());
        System.out.println("Color = " + BMW.getColor());
        System.out.println("Doors = " + BMW.getDoors());

    }
}
