/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course;

import Business.Profiles.ProfessorProfile;
import java.util.ArrayList;

/**
 *
 * @author MIS
 */
public class Course {
    private String name;
    private ProfessorProfile professor;
    private String topic;
    private String region;
    private String language;
    private ArrayList<String> studentList;
    private String semester;
    
    private ArrayList<CourseEvaluation> evaluations;
    
    
    // 不確定一開始建立時要多少，先這樣
    public Course(String courseName, ProfessorProfile professor, String topic, String region, String language) {
        this.name = courseName;
        this.professor = professor;
        this.topic = topic;
        this.region = region;
        this.language = language;
        this.evaluations = new ArrayList<>();
    }
    
    // 評價儲存
    public void addEvaluation(String comment, int rating) {
        CourseEvaluation evaluation = new CourseEvaluation(comment, rating);
        evaluations.add(evaluation);
    }

    public ArrayList<CourseEvaluation> getEvaluations() {
        return evaluations;
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProfessorProfile getProfessor() {
        return professor;
    }
           
    public String getpName() {
        return professor.getName();
    }
    
//    應該不需要setter
//    public void setpName(String pName) {
//        this.pName = pName;
//    }

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

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    
    
}
