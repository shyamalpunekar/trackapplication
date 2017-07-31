import shapes.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class TriangleTracker {

    public static void main(String[] args) {
//
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the three sides of an triangle");


        try {
            System.out.println("Whats the length of the first side?");
            String inputSideA = bufferedReader.readLine();
            int firstSide = Integer.parseInt(inputSideA);

            System.out.println("Whats the length of the second side?");
            String inputSideB = bufferedReader.readLine();
            int secondSide = Integer.parseInt(inputSideB);

            System.out.println("What's the length of the third side?");
            String inputSide3 = bufferedReader.readLine();
            int thirdSide = Integer.parseInt(inputSide3);

            Triangle threeSides = new Triangle(firstSide, secondSide, thirdSide);


            if(threeSides.isAtriangle()){
                if(threeSides.isEquilateral()){
                    System.out.println("It's an equilateral triangle!");
                }else if(threeSides.isIsosceles()){
                    System.out.println("It's an isosceles triangle!");
                }else if(threeSides.isScalene()){
                    System.out.println("It's a scalene triangle!");
                }
            }
            else {
                System.out.println("I'm sorry, that's not a triangle!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
