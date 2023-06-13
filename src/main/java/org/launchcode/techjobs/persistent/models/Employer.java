package org.launchcode.techjobs.persistent.models;

import org.launchcode.techjobs.persistent.models.data.JobRepository;

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
    @JoinColumn (name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message="This cannot be left blank.")
    @Size(message="No more than 150 characters.")
    private String location;

    public Employer() {}


    public List<Job> getJobs() {
        return jobs;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
