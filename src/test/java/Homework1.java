import org.junit.jupiter.api.Test;

import static java.lang.Math.*;


public class Homework1 {

    @Test
    public void homeWork_1() {
        /**     1. Name & Age   */
        nameAndAge("Yury", 99);

        /**     2. Fuel consumption per 100 km  */
        fuelConsumptionPer100km(250, 50);

        /**     3. Perimeter of a circle (meters) | The number of turns / 1000 km   */
        perimeterOfCircleAndNumberOfTurns(0.19);

        /**     4*. Distance between 2 coordinates   */
        distanceBetweenTwoCoordinates(56.965163, 24.116590, 56.959359, 24.119212);

    }


    private void nameAndAge(String name, int age) {
        System.out.println("1. Hi " + name + ", you are already " + age + " years old.");
    }

    private void fuelConsumptionPer100km(double km, double L) {
        System.out.println("2. The fuel consumption is: " + (L / km * 100) + " L/100 km.)");
    }

    private double perimeterOfCircleAndNumberOfTurns(double radius) {
        double perimetrOfCircle = (2 * PI * radius);
        double numberOfTurns = 1000 / perimetrOfCircle;
        System.out.println("3. The circle's perimeter is: " + perimetrOfCircle + " meters and it needs " + Math.round(numberOfTurns * 100) / 100 + " turns to make 1000 km.");
        return perimetrOfCircle;
    }
asd adasd asd
    //Math.round(a*100)/100
    // work :    56.965163, 24.116590
    // courses : 56.959359, 24.119212
    // square : Math.pow(i, 2);
    // Distance: d = //(x2−x1)2+(y2−y1)2
    private void distanceBetweenTwoCoordinates(double longitude1, double latitude1, double longitude2, double latitude2) {
        double distance = sqrt(Math.pow((longitude2 - longitude1), 2) + Math.pow((latitude2 - latitude1), 2));
        System.out.println("4. The distance between 2 coordinates is: " + distance + " km.");
    }

}
