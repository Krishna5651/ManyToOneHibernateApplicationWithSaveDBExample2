/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 13:02
 * Project: ManyToOneHibernateApplicationWithSaveDBExample2
 **/

package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stud")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_Id;
    private String student_Name;
    private String roll_No;
    @ManyToOne(cascade = CascadeType.ALL)
    private University university;

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public String getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(String roll_No) {
        this.roll_No = roll_No;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}


