/**
 * Created By Krishna Shinde
 * Date : 03-07-2023
 * Time : 13:02
 * Project: ManyToOneHibernateApplicationWithSaveDBExample2
 **/

package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String university_Name;
    private String university_Code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversity_Name() {
        return university_Name;
    }

    public void setUniversity_Name(String university_Name) {
        this.university_Name = university_Name;
    }

    public String getUniversity_Code() {
        return university_Code;
    }

    public void setUniversity_Code(String university_Code) {
        this.university_Code = university_Code;
    }
}


