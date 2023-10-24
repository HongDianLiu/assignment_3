/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

    // 如果你的person資料沒有正確傳遞的話有可能是因為這裡宣告了 person
    Person person; 
//    Transcript transcript;
    //   EmploymentHistroy employmenthistory;

    public StudentProfile(Person p) {
        super(p);

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }

    @Override
    public String getRole() {
        return "Student";
    }

// 已經繼承了，不需要寫上
//    public boolean isMatch(String id) {
//        return person.getPersonId().equals(id);
//    }

}
