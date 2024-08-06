/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mysql;

/**
 *
 * @author mehak
 */
public class Student {
    
   private int studentId;
   private String studentName;
   private int studentMarks;
    public Student(){
    }
    public Student(int stu_id,String stu_name,int stu_marks)
    {
        this.studentId=stu_id;
        this.studentName=stu_name;
        this.studentMarks=stu_marks;
    }
    @Override
    public String toString(){
        return this.studentId +this.studentName+this.studentMarks;
    }
    
}
