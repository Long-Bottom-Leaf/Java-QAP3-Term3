package Problem1;

public class Person {
    protected String myName;        // name of the person
    protected int myAge;            // age of the person
    protected String myGender;      // "M" for male, "F" for female

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }
}
