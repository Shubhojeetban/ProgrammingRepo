/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancetopics;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author ACER
 */
class Student implements Serializable {

    int rollNo;
    String Name;
    static String contact;

    Student(int rollNo, String Name, String contact) {
        this.rollNo = rollNo;
        this.Name = Name;
        this.contact = contact;
    }
}

public class AdvanceTopics {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Student st = null;
            FileInputStream fis = new FileInputStream("D://Java Projects/AdvanceTopics/student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            st = (Student)ois.readObject();
            
            System.out.println(st.rollNo);
            System.out.println(st.Name);
            System.out.println(st.contact);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
