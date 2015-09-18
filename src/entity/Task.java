/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Nikolaj
 */
@Entity
public class Task extends BaseEntity{
   

    @ManyToOne
    private Project project;   
    private String name;
    private String description;
    private String hoursAssigned;
    private String hoursUsed;

    public Task() {
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }  

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHoursAssigned() {
        return hoursAssigned;
    }

    public void setHoursAssigned(String hoursAssigned) {
        this.hoursAssigned = hoursAssigned;
    }

    public String getHoursUsed() {
        return hoursUsed;
    }

    public void setHoursUsed(String hoursUsed) {
        this.hoursUsed = hoursUsed;
    }
              
    
}
