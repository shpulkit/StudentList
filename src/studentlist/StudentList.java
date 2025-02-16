/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package studentlist;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * A class that creates an Array of Students and populates it
 * with 1 student from the current section and then iterates over the
 * list to print each name.
 * @author dancye, Jan 2019
 * @modified Jan 19,2024
 */
public class StudentList {
    
    public static void main(String[] args)
    {
       Student [] studentList = new Student[1];//change size before running
      
       studentList[0]=new Student();
       studentList[0].setName("abc");
       //fill in 4 student names before running
       for(Student s: studentList)
       {
           System.out.println(s.getName());
       }
        
    }
    
}
