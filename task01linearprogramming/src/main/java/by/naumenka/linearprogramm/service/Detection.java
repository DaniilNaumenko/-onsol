package by.naumenka.linearprogramm.service;

import java.util.Scanner;

public class Detection {
    Scanner detect = new Scanner(System.in);
    public void functional(){
        double firstAbscissa = 0;
        double firstOrdinate = 0;
        double secondAbscissa = 0;
        double secondOrdinate = 0;
        double pointOne;
        double pointTwo;
        System.out.print("Enter Abscissa 1:");
        if(detect.hasNextDouble())
            firstAbscissa = detect.nextDouble();
        System.out.print("Enter Ordinate 1:");
        if(detect.hasNextDouble())
            firstOrdinate = detect.nextDouble();
        System.out.print("Enter Abscissa 2:");
        if(detect.hasNextDouble())
            secondAbscissa = detect.nextDouble();
        System.out.print("Enter Ordinate 2:");
        if(detect.hasNextDouble())
            secondOrdinate = detect.nextDouble();
        pointOne = Math.sqrt(firstAbscissa * firstAbscissa + firstOrdinate * firstOrdinate);
        pointTwo = Math.sqrt(secondAbscissa * secondAbscissa + secondOrdinate * secondOrdinate);
        if(pointOne < pointTwo)
            System.out.print("first point closer");
        else if(pointOne > pointTwo)
            System.out.print("second point closer");
        else System.out.print("equally");
    }
}