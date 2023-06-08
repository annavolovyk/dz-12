package manandwoman;

public class Woman extends Person {

    private String oldLastName;

    public Woman(String firstname, String lastname, int age, Person partner) {
        super(firstname, lastname, partner, age);
    }
    public void setOldLastName(String oldLastName) {
        this.oldLastName = oldLastName;
    }

    @Override
    public boolean isRetired() {
        return getAge() > 60;
    }


    public Object registerPartnership(Person partner) {
        if (getPartner() == null) {
            setLastName(String.valueOf(getPartner().getLastName()));
        } else
            System.out.println("Has a partner");;
        return getPartner();
    }

    public void deregisterPartnership(boolean returnToOldLastName) {
        if (getPartner() == null) {
            System.out.println(getFirstName() + " " + getLastName() + "- has no partner.");
            return;
        }
        if (returnToOldLastName && oldLastName != null) {
            setLastName(oldLastName);
        }
        setPartner(null);
    }
}


