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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

/**
 *
 * @author Nikolaj
 */
@Entity
public class ProjectUser extends BaseEntity{

    private String userName;
    private String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;
    
    @ManyToMany
    private List<Project> projects;
   
    public ProjectUser() {
    }

    public ProjectUser(String userName, String email, Date created) {
        this.userName = userName;
        this.email = email;
        this.created = created;
    }

     public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Navn: " + userName + " Id: " + id; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
