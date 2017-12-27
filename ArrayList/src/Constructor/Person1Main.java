
package Constructor;


public class Person1Main {

    
    public static void main(String[] args) {
        Person1 pers1 = new Person1( "Simona Adalberth");
        pers1.setAge(42);
        pers1.setGender("Female");
        
        Person1 pers2 = new Person1( "John Smith");
        pers2.setAge(25);
        pers2.setGender("Male");
        
        Person1 pers3 = new Person1( "Bobby Steven");
        pers3.setAge(37);
       pers3.setGender("Male");
        
        System.out.println( pers1.getName() + " " + pers1.getAge() + " " + pers1.getGender());
        System.out.println( pers2.getName() + " " + pers2.getAge() + " " + pers2.getGender());
        System.out.println( pers3.getName() + " " + pers3.getAge() + " " + pers3.getGender());
    }
}
