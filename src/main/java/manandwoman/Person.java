package manandwoman;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Person partner;
    private int age;

    public Person(String firstName, String lastName, Person partner, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.partner = partner;
        this.age = age;
    }

    public Person() {

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

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }


    public abstract boolean isRetired();
}
