
package student;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@Named(value = "studentBean")
@RequestScoped
public class StudentBean {

    private String firstName;
    private String lastName;
    private int age;
    private String location;
    
    @Inject
    private Subject subject;
    
    @Inject
    private NavigationController nav;

    public StudentBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public NavigationController getNav() {
        return nav;
    }

    public void setNav(NavigationController nav) {
        this.nav = nav;
    }

}
