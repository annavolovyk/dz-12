package manandwoman;

public class Woman extends Person {

    private String oldLastName;

    public Woman(String firstname, String lastname, int age, Person partner) {
        super();
    }

    @Override
    public boolean isRetired() {
        return getAge() > 60;
    }
    public Object registerPartnership() {
        if (getPartner() == null) {
            setLastName(String.valueOf(getPartner().getLastName()));
        } else
            System.out.println("Has a partner");;
        return getPartner();
    }

    public void deregisterPartnership(boolean returnToOldLastName) {
        if (getPartner() == null) {
            System.out.println(getFirstName() + " " + getLastName());
            return;
        }
        if (returnToOldLastName) {
            setLastName(oldLastName);
        }
        setPartner(null);
    }
}

