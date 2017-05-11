/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author cultivator
 */
public class Student extends Person{

    public Student(String name, String sname, String id_no) {
        super(name, sname, id_no);
    }
    
    private String faculty;
    private String snum;

    public Student(String faculty, String snum) {
        this.faculty = faculty;
        this.snum = snum;
    }

    @Override
    public String toString() {
        return "Student Details are as follows: \n {name --> " + super.getFname() 
                +"\n Surname --> "+ super.getSurname() 
                + "\n ID Number -->" +super.getIdno() 
                + "\n Faculty --> " + faculty + 
                "\n Student Number --> " + snum + '}';
    }
    
}
