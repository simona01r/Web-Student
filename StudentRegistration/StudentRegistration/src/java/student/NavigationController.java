
package student;

import javax.inject.Named;

import javax.enterprise.context.RequestScoped;


@Named
@RequestScoped
public class NavigationController {
    private String location;
    
    public String navigate(){
        if(this.location.equalsIgnoreCase("Göteborg")){
        return "confirmation";
        }
           return "confirmation2"; 
           }
   
    public NavigationController() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
}
