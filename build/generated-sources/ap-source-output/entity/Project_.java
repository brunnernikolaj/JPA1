package entity;

import entity.ProjectUser;
import entity.Task;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T23:27:38")
@StaticMetamodel(Project.class)
public class Project_ extends BaseEntity_ {

    public static volatile SingularAttribute<Project, Date> created;
    public static volatile SingularAttribute<Project, String> name;
    public static volatile SingularAttribute<Project, String> description;
    public static volatile SingularAttribute<Project, Date> lastModified;
    public static volatile ListAttribute<Project, ProjectUser> users;
    public static volatile ListAttribute<Project, Task> tasks;

}