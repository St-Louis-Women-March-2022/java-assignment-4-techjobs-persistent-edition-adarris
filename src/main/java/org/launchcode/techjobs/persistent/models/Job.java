package org.launchcode.techjobs.persistent.models;

import org.launchcode.techjobs.persistent.models.data.EmployerRepository;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;

    @ManyToOne
    private Employer employer;
    private String skills;

    public Job() {
    }

//    public Job(String anEmployer, String someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
