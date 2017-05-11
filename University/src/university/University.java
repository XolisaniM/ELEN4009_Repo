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
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("Arthur","Dent", "H00098889");
        System.out.println(p1);
        
        Student s1 = new Student("Xolisani", "Mthimunye","501468");
        Student s2 = new Student("Engineering", "A2342");
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
