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
public class CourseDirectory {
    private ArrayList<Course> courseList;
    
    public CourseDirectory(){
        this.courseList = new ArrayList<Course>();
        
    }
    
    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    
    // 應該不需要
    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    public Course addCourse(String courseName, ProfessorProfile professor, String topic){
        Course course = new Course(courseName,professor, topic);
        courseList.add(course);
        return course;
    }
    
    public void deleteCourse(Course course){
       courseList.remove(course);
   }
    public Course searchCourse(String search){
        for(Course course : courseList){
        if(course.getpName().equalsIgnoreCase(search)){
            return course;
        }
        else if(course.getTopic().equalsIgnoreCase(search)){
            return course;
        }
        else if(course.getRegion().equalsIgnoreCase(search)){
            return course;
        }
        else if(course.getLanguage().equalsIgnoreCase(search)){
            return course;
        }
        }
        return null; // Return null if no match is found
   }
}
