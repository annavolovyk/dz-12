package personTests;
import manandwoman.Person;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTest {
    private Person person;
    private Person partner;

    @Test(dataProvider = "manFirstNameData", priority = 10, description = "Should be run after testGetWomanFirstName")
    public void testGetManFirstName(String manFirstName, String manRightFirstName) {
        person.setFirstName(manFirstName);
        Assert.assertEquals(person.getFirstName(), manRightFirstName);
    }

    @DataProvider(name = "manFirstNameData")
    public Object[][] manDataFirstName() {
        return new Object[][]{
                {"Mark", "Alex"},
                {"John", "David"},
                {"Michael", "Peter"}
        };
    }

    @Test(dataProvider = "womanFirstNameData", priority = 4)
    public void testGetWomanFirstName(String womanFirstName, String womanRightFirstName) {
        person.setFirstName(womanFirstName);
        Assert.assertEquals(person.getFirstName(), womanRightFirstName);
    }

    @DataProvider(name = "womanFirstNameData")
    public Object[][] womanDataFirstName() {
        return new Object[][]{
                {"Mary", "Anna"},
                {"Juliet", "Valery"},
                {"Roberta", "Emma"}
        };
    }

    @Test(dataProvider = "manLastNameData")
    public void testGetManLastName(String manLastName, String manRightLastName) {
        person.setLastName(manLastName);
        Assert.assertEquals(person.getLastName(), manRightLastName);
    }

    @DataProvider(name = "manLastNameData")
    public Object[][] manDataLastName() {
        return new Object[][]{
                {"Smith", "Black"},
                {"Reynolds", "Hardy"},
        };
    }

    @Test(dataProvider = "womanLastNameData")
    public void testGetWomanLastName(String womanLastName, String womanRightLastName) {
        person.setLastName(womanLastName);
        Assert.assertEquals(person.getLastName(), womanRightLastName);
    }

    @DataProvider(name = "womanLastNameData")
    public Object[][] womanDataLastName() {
        return new Object[][]{
                {"Smith", "Black"},
                {"Reynolds", "Hardy"},
        };
    }

    @Test(dataProvider = "manAge")
    public void testManGetAge(int manActualAge, int manExpectedAge) {
        person.setAge(manActualAge);
        Assert.assertEquals(person.getAge(), manExpectedAge);
    }

    @DataProvider(name = "manAge")
    public static Object[][] manAgeData() {
        return new Object[][]{{60}, {66}, {65}};
    }

    @Test(dataProvider = "womanAge")
    public void testWomanGetAge(int womanActualAge, int womanExpectedAge) {
        person.setAge(womanActualAge);
        Assert.assertEquals(person.getAge(), womanExpectedAge);
    }

    @DataProvider(name = "womanAge")
    public static Object[][] womanAgeData() {
        return new Object[][]{{59}, {66}, {61}};
    }

    @Test(dataProvider = "manPartner")
    public void testGetManPartner(Person partner) {
        person.setPartner(partner);
        Assert.assertEquals(person.getPartner(), partner);
    }
    @DataProvider(name = "manPartner")
    public Object[][] manPartnerData() {
        person.setFirstName("Alex");
        return new Object[][]{{null}, {person}};
    }
    @Test(dataProvider = "womanPartner")
    public void testGetWomanPartner(Person partner) {
        person.setPartner(partner);
        Assert.assertEquals(person.getPartner(), partner);
    }
    @DataProvider(name = "womanPartner")
    public Object[][] womanPartnerData() {
        person.setFirstName("Mary");
        return new Object[][]{{null}, {person}};
    }
}