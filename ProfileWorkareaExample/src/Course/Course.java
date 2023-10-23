/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course;

import java.util.ArrayList;

/**
 *
 * @author MIS
 */
public class Course {
    private String pName;
    private String topic;
    private String region;
    private String language;
    private ArrayList<String> studentList;
    private double professorRating;
// 或者使用方法
    public double getProfessorRating() {
        return professorRating;
    }
    public void setProfessorRating(double professorRating) {
        this.professorRating = professorRating;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<String> studentList) {
        this.studentList = studentList;
    }
    
}
