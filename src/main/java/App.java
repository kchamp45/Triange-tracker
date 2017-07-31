import shapes.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
        System.out.println("What is the length first side?");
        String userInputA = bufferedReader.readLine();
        int sideA = Integer.parseInt(userInputA);
        System.out.println("What is the length second side?");
        String userInputB = bufferedReader.readLine();
        int sideB = Integer.parseInt(userInputB);
        System.out.println("What is the length third side?");
        String userInputC = bufferedReader.readLine();
        int sideC = Integer.parseInt(userInputC);

        Triangle threeSides = new Triangle(sideA, sideB, sideC);

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
        }catch (IOException e){
        e.printStackTrace();
    }
  }
}
