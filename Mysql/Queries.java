/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mysql;

/**
 *
 * @author mehak
 */
public class Queries {
 
    public  static String giveStAndAdd(){
        return "select stu_id, stu_name , stu_marks,city from student inner join address on student.stu_id=address.st_id;";
    }
}
