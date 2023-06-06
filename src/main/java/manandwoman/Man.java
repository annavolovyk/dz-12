package manandwoman;

public class Man extends Person {

    public Man(String firstname, String lastname, int age, Person partner) {
        super();
    }
    @Override
    public boolean isRetired() {
        return getAge() > 65;
        }
}



