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
        if (partner != null) {
            setLastName(partner.getLastName());
        } else {
            System.out.println("Has no partner.");
        }
    }

    public void deregisterPartnership(boolean returnToOldLastName) {
        if (getPartner() == null) {
            System.out.println(getFirstName() + " " + getLastName() + "- has no partner.");}
        if (returnToOldLastName) {
            setLastName(oldLastName);
            if (oldLastName == null) {
                System.out.println("There is no maiden name");}
        }
        setPartner(null);
    }
}


