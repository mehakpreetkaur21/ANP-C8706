/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul3;

/**
 *
 * @author mehak
 */
public class Student {
    public static int add(int a, int b){
        int c=a+b;
        System.out.println("two parameters");
        return c;
    }
        public static int add(int a, int b,int c){
        int d=a+b+c;
        return d;
    }
        public static int add(int ...a){
            int num=0;
            for(int c:a){
                num+=c;
                
            }
            System.out.println("var args");
            return num;
        }
        public static void main(String [] a){
            int sum1=add(12,23,34);
             int sum2=add(12,23);
             int sum3=add(12,23,34,45,56);
             System.out.println(sum1 +" "+ sum2 +" "+sum3);
        }
    
}
