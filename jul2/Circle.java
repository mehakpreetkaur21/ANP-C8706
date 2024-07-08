/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul2;
import java.math.Math.PI;

/**
 *
 * @author mehak
 */
public class Circle extends Shape{
    private static double pi=Math.PI;
    public static double area(double r){
        return pi*r*r;
    }
     public static void main(String args[]){
        double ar=area(21.0);
        int ar1=area(0,0);
        System.out.println(ar);
        System.out.println(ar1);
    }
}
