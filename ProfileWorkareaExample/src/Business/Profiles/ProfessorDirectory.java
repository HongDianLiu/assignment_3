/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author daniel_newheart
 */
public class ProfessorDirectory {
    ArrayList<ProfessorProfile> professorlist;
    
    public ProfessorDirectory(){
        
        professorlist = new ArrayList<>();
        
    }
    
    public ProfessorProfile addProfessorProfile(Person p, String name, String specialization) {

        ProfessorProfile prof = new ProfessorProfile(p, name, specialization);
        professorlist.add(prof);
        return prof;
    }

    public ProfessorProfile findProfessor(String id) {

        for (ProfessorProfile prof : professorlist) {

            if (prof.isMatch(id)) {
                return prof;
            }
        }
            return null; //not found after going through the whole list
         }


}

