package manandwomantests;
import dataproviders.TestDataProvider;
import manandwoman.Person;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTest {
    private Person person;
    @BeforeMethod
    public void creatingPerson() {
        person = new Person("Alex", "Smith", null, 65) {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
    }
    @Test(dataProvider = "personTestData", dataProviderClass = TestDataProvider.class)
    public void testGetFirstName(String firstName, String lastName, Person partner, int age) {
        person.setFirstName(firstName);
        Assert.assertEquals(person.getFirstName(), firstName);
    }

    @Test(dataProvider = "personTestData", dataProviderClass = TestDataProvider.class)
    public void testSetFirstName(String firstName, String lastName, Person partner, int age) {
        person.setFirstName(firstName);
        Assert.assertEquals(person.getFirstName(), firstName);
    }
    @Test(dataProvider = "personTestData", dataProviderClass = TestDataProvider.class)
    public void testGetLastName(String firstName, String lastName, Person partner, int age) {
        person.setLastName(lastName);
        Assert.assertEquals(person.getLastName(), lastName);
    }
    @Test(dataProvider = "personTestData", dataProviderClass = TestDataProvider.class)
    public void testSetLastName(String firstName, String lastName, Person partner, int age) {
        person.setLastName(lastName);
        Assert.assertEquals(person.getLastName(), lastName);
    }

    @Test(dataProvider = "personTestData", dataProviderClass = TestDataProvider.class)
    public void testGetAge(String firstName, String lastName, Person partner, int age) {
        person.setAge(age);
        Assert.assertEquals(person.getAge(), age);
    }
    @Test(dataProvider = "personTestData", dataProviderClass = TestDataProvider.class)
    public void testSetAge(String firstName, String lastName, Person partner, int age) {
        person.setAge(age);
        Assert.assertEquals(person.getAge(), age);
    }
    @Test(dataProvider = "personTestData", dataProviderClass = TestDataProvider.class)
    public void testGetPartner(String firstName, String lastName, Person partner, int age) {
        person.setPartner(partner);
        Assert.assertEquals(person.getPartner(), partner);
    }
    @Test(dataProvider = "personTestData", dataProviderClass = TestDataProvider.class)
    public void testSetPartner(String firstName, String lastName, Person partner, int age) {
        person.setPartner(partner);
        Assert.assertEquals(person.getPartner(), partner);
    }
}