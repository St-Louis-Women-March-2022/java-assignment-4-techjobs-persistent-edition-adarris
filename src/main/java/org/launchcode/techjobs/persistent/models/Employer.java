package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
   @OneToMany
   @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message="Location cannot be blank")
    @Size(min=2, max=255)
    private String location;
//    public Employer(int id, String name, String location) {
//        super();
//        this.location = location;
//    }

    public Employer() {
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
