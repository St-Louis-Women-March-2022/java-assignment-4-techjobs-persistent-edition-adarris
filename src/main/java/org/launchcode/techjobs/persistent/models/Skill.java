package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @Size(min=2, max=255)
    private String description;

//    public Skill(int id, String name, String description) {
//        super();
//        this.description = description;
//    }
    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}