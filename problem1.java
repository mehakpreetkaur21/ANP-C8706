/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul1;

/**
 *
 * @author mehak
 */
public class problem1 {
     private static int Count=0;
    problem1(){
        Count ++;
    }
   
    public static int getObjectCount() {
        
        return Count;
    }
    public static void main(String args[]){
        problem1 p1=new problem1();
        problem1 p2=new problem1();
        problem1 p3=new problem1();
        problem1 p4=new problem1();
        problem1 p5=new problem1();
        int countt=problem1.getObjectCount();
        System.out.println("total objects"+countt);
    }

}
