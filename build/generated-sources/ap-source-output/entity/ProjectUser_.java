package entity;

import entity.Project;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T23:27:38")
@StaticMetamodel(ProjectUser.class)
public class ProjectUser_ extends BaseEntity_ {

    public static volatile ListAttribute<ProjectUser, Project> projects;
    public static volatile SingularAttribute<ProjectUser, Date> created;
    public static volatile SingularAttribute<ProjectUser, String> userName;
    public static volatile SingularAttribute<ProjectUser, String> email;

}