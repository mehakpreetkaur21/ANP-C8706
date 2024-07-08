/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul2;

/**
 *
 * @author mehak
 */
public class Rectangle extends Shape {
    public static int area(int l,int b){
        return l*b;
    }
    public static void main(String args[]){
        int ar=area(12,21);
        int ar1=area(0,0);
        System.out.println(ar);
        System.out.println(ar1);
    }
}
