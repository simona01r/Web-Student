
package Constructor;


public class Person1 {
 private String name;
    private int age;
    private String gender; //male == 'M' , female == 'F'

    public Person1(String name) {
        this.name = name;
      
    }

    void setAge(int age) {
        this.age = age;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

  public String getGender() {
        return gender;
    }

    String getName() {
        return name;
    }

    
    public String toString() {
        return ("Name: " + name
                + ", Age: " + age + ", Gender: " + gender);
    }
   
}
