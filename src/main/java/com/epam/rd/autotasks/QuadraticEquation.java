package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant=b*b-4*a*c;
        if (discriminant<0){
            System.out.println("no roots");
        } else if (discriminant==0) {
            System.out.println(-b/(2*a));
        }
            else {
            System.out.println((-Math.sqrt(discriminant)-b)/(2*a)+" "+(Math.sqrt(discriminant)-b)/(2*a));
        }
    }
}