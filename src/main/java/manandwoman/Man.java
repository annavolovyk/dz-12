package manandwoman;

public class Man extends Person {

    public Man() {
        super();
    }
    @Override
    public boolean isRetired() {
        return getAge() > 65;
        }
}



