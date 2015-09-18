/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpapersistence;

import entity.BaseEntity;
import entity.Project;
import entity.ProjectUser;
import entity.Task;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Nikolaj
 */
public class JPAFacade {

    EntityManager manager;

    public JPAFacade() {
        manager = Persistence.createEntityManagerFactory("PU").createEntityManager();
    }

    public ProjectUser findUser(long id) {
        return manager.find(ProjectUser.class, id);
    }

    public List<ProjectUser> getAllUsers() {
        Query query = manager.createQuery("SELECT u FROM ProjectUser u");
        return query.getResultList();
    }

    public Project findProject(long id) {
        return manager.find(Project.class, id);
    }

    public void assignUser(ProjectUser user, long projectId) {
        Project project = manager.find(Project.class, projectId);

        project.getUsers().add(user);
        user.getProjects().add(project);

        updateMany(user,project);
    }

    public void assignTask(Task task, long projectId) {
        Project project = manager.find(Project.class, projectId);

        project.getTasks().add(task);
        task.setProject(project);

        updateMany(task,project);
    }

    public <T extends BaseEntity> void create(T entity) {
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();
        manager.persist(entity);
        transaction.commit();
    }
    
    public <T extends BaseEntity> void update (T entity){
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();
        manager.merge(entity);
        transaction.commit();
    }
    
    public <T extends BaseEntity> void updateMany (T... entities){
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();
        for (T entity : entities){
            manager.merge(entity);
        }      
        transaction.commit();
    }
    
    public <T extends BaseEntity> void delete (T entity){
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();
        manager.remove(entity);
        transaction.commit();
    }

    public void createTaskAndAssign(Task task, long projectId) {
        create(task);
        assignTask(task, projectId);
    }
}
