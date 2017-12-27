package Constructor;

public class ConstructorPerson {

    private int personalId;
    private String name;
    private int age;
    private String gender;
    

    public ConstructorPerson(int personalId, String name, int age, String gender) {
        this.personalId = personalId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
        

    public void talking(String talk){
        if (talk.equalsIgnoreCase("yes")) 
            System.out.println(name+" is talking");
        else 
            System.out.println(name+" is not talking");
        
    }

    public void eating(String eat) {
        if (eat == "yes") {
            System.out.println(name+" is eating");
        } else {
            System.out.println(name+" is not eating");
        }
    }
    
     public void running(String run) {
        if (run == "yes") {
            System.out.println("He is runing");
        } else {
            System.out.println("He is not runing");
        }
    }

     public int getPersonalId(){
         return personalId;
     }
     
     public String getName(){
        return name;
    }
    public int getAge(){
        return age;
          }

    public String getGender() {
        return gender;
    }
  
}
