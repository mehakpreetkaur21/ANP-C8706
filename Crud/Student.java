/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crud;

/**
 *
 * @author mehak
 */
public class Student {
    private int studentId;
    private String studentName;
    private int studentMarks;
    public Student(){}
    public Student(int studentId, String studentName, int studentMarks){
    this.studentId=studentId;
    this.studentName=studentName;
    this.studentMarks=studentMarks;
    }
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();   
        System.out.println(s1);
        System.out.println(s2);
    }
}
