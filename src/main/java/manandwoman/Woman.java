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

    public void registerPartnership(Person partner) {
        if (getPartner() == null) {
            setPartner(partner);
            System.out.println("Partnership registered with " + partner.getLastName());
        } else {
            System.out.println("Already has a partner.");
        }
    }

    public void deregisterPartnership(boolean returnToOldLastName) {
        if (getPartner() == null) {
            System.out.println(getFirstName() + " " + getLastName() + " has no partner.");
        }
        if (returnToOldLastName) {
            setLastName(oldLastName);
        }
        setPartner(null);
    }
}


