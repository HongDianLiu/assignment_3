/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import Course.Course;
import java.util.ArrayList;

/**
 *
 * @author daniel_newheart
 */
public class ProfessorProfile extends Profile{
    
    String name;
    String specialization;
    ArrayList<Course> currentCourses;
    float reputationIndex;
    // 看到過去開設的課程
    ArrayList<Course> courseHistory;
    ArrayList<String> employerFeedbacks;
    
    
    public ProfessorProfile(Person p, String name, String specialization) {

        super(p); 
        this.name = name;
        this.specialization = specialization;

    }
    
    // 目前沒有做任何驗證，有需要再加
    public void addCurrentCourses(Course course) {
        currentCourses.add(course);   
    }
    
    public void addEmployerFeedback(String feedback) {
        employerFeedbacks.add(feedback);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public ArrayList<Course> getCurrentCourses() {
        return currentCourses;
    }
    
    public float getReputationIndex() {
        return reputationIndex;
    }

    public void setReputationIndex(float reputationIndex) {
        this.reputationIndex = reputationIndex;
    }

    public ArrayList<Course> getCourseHistory() {
        return courseHistory;
    }

    public ArrayList<String> getEmployerFeedback() {
        return employerFeedbacks;
    }
    
    
    
    @Override
    public String getRole() {
        return "Prof";
    }

//    已經繼承了，不需要寫上
//    public boolean isMatch(String id) {
//        return person.getPersonId().equals(id);
//    }
    
}
