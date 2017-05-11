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
public class Person {
    private String fname, surname;
    private String idno;

    public Person() {
    }

    Person(String name, String sname, String id_no) {
        this.idno =id_no;
        this.fname = name;
        this.surname =sname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    @Override
    public String toString() {
        return "Person{" + "fname=" + fname + ", surname=" + surname + ", idno=" + idno + '}';
    }
    
}
