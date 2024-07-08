/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul3;
import java.math.Math.*;

/**
 *
 * @author mehak
 */
public class Calculator {
static double PI = Math.PI;
    public static double calculateArea(double rad){
        double area= PI*rad*rad;
        return area;
    }
     public static double calculateArea(double len,double breadth){
        double area= len*breadth;
        return area;
    }
      public static double calculateArea(double base,double height, double width){
        double area= base*height*width;
        return area;
    }
      public static void main(String args[]){
          double a=calculateArea(12);
          double b=calculateArea(12,21);
          double c=calculateArea(12,21,12);
          System.out.println(a +  "  "+b+ "  "+c);
          
      }
}
