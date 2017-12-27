package Constructor;

public class ConstructorPersonMain {

    public static void main(String[] args) {
        ConstructorPerson NewPerson = new ConstructorPerson(123, "Gunnar Adalberth", 42, "Male");
        NewPerson.eating("yes");
        NewPerson.talking("yes");
        NewPerson.running("yes");
        System.out.println(NewPerson.getPersonalId() + " " + NewPerson.getName() + " "
                + NewPerson.getAge() + " " + NewPerson.getGender());
    }
}
