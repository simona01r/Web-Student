package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;
import javax.annotation.PostConstruct;

@Named(value = "userNumberBean")
@SessionScoped

public class UserNumberBean implements Serializable {

    private Integer RANDOMiNT;
    private Integer userNumber;
    private String response;
    private long maximum = 10;
    private long minimum = 1;

    public UserNumberBean() {
        Random random = new Random();
        RANDOMiNT = random.nextInt(10) + 1;
    }

    public String getResponse() {
        if (userNumber.equals(RANDOMiNT)) {
            return "Yes, you guessed the right number!\n";
        } else if (userNumber < RANDOMiNT) {
            return "Sorry, too low.\n";
        } else {
            return "Sorry, too high.\n";
        }
    }
   
    public String reset() {
        this.userNumber=0;
        Random random = new Random();
        RANDOMiNT = random.nextInt(10) + 1;
        return "index";
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public long getMaximum() {
        return maximum;
    }

    public long getMinimum() {
        return minimum;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public void setMaximum(long maximum) {
        this.maximum = maximum;
    }

    public void setMinimum(long minimum) {
        this.minimum = minimum;
    }

    public Integer getRandomInt() {
        return RANDOMiNT;
    }

}
