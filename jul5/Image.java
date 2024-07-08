/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul5;

/**
 *
 * @author mehak
 */
public class Image  implements Printable{
    int width=12,height=21;
    @Override 
    public void input(){
        System.out.println(width+" "+height);
    }
    public static void main(String args[]){
 Printable p=new Image();
 p.input();
    }
}
