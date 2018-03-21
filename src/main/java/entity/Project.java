package entity;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by vserdiuk on 2/4/17.
 */
@Entity
@Table(name="PROJECT")
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Proj_seq")
    @SequenceGenerator(name="Proj_seq", sequenceName="ProjSeq" ,allocationSize=1)
    private Long id;

    @Column (name = "TITLE")
    private String title;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees;

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
