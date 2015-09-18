/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Nikolaj
 */
@Entity
public class Project extends BaseEntity{
       
    private String name;
    private String description;
    
    @ManyToMany(mappedBy = "projects")
    List<ProjectUser> users;
    @OneToMany(mappedBy = "project")
    private List<Task> tasks;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    Date created;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date lastModified;
    

     public Project() {
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
         

    public List<ProjectUser> getUsers() {
        return users;
    }

    public void setUsers(List<ProjectUser> users) {
        this.users = users;
    }     

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }   

    @Override
    public String toString() {
        return name + " | " + description; 
    }
    
    
    
}
