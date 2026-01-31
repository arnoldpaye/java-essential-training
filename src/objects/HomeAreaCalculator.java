package objects;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {
  public static void main(String[] args) {
    Rectangle room1 = new Rectangle();
    room1.setWidth(25);
    room1.setLength(50);
    double areaOfRoom1 = room1.calculateArea();
    System.out.println("Area of room 1: " + areaOfRoom1);

    Rectangle room2 = new Rectangle(30, 75);
    double areaOfRoom2 = room2.calculateArea();
    System.out.println("Area of room 2: " + areaOfRoom2);
  }
}
