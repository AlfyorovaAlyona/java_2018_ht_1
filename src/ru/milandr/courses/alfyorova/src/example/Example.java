package example;
import hometask1.Elephant;
import hometask2.Coordinates;

public class Example {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("Vasya", 58, 10);
        System.out.println(elephant.toString());
        elephant.eat();
        System.out.println(elephant.toString());
        elephant.setName("Valiliy");
        System.out.println(elephant.toString());

        System.out.print("------\n");

        Coordinates coordinates = new Coordinates(-3, -3);
        System.out.printf("Distance between (-1, -1): %.2f%n", coordinates.getDistanceTo(-1, -1));
        coordinates.getEquationOfLine(1, 1);
        Coordinates midCoor = coordinates.getMiddle(2, 2);
        System.out.printf("Distance between: %.2f%n", Coordinates.getDistanceBetween(coordinates, midCoor));
        System.out.println("X mid : " + midCoor.getX() + ", Y mid :" + midCoor.getY());
        coordinates.getCircle(2, 2, 1, 1, 2, 2);

    }
}