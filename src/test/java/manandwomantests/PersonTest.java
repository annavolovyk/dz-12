package manandwomantests;
import manandwoman.Person;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PersonTest {
    @Test(dataProvider = "manFirstNameData", priority = 10, description = "Should be run after testGetWomanFirstName")
    public void testGetManFirstName(String manFirstName, String manRightFirstName) {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
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
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
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
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
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
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
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
    public void testGetManAge(int manActualAge, int manExpectedAge) {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person.setAge(manActualAge);
        Assert.assertEquals(person.getAge(), manExpectedAge);
    }

    @DataProvider(name = "manAge")
    public static Object[][] manAgeData() {
        return new Object[][]{{60}, {66}, {65}};
    }

    @Test(dataProvider = "womanAge")
    public void testGetWomanAge(int womanActualAge, int womanExpectedAge) {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person.setAge(womanActualAge);
        Assert.assertEquals(person.getAge(), womanExpectedAge);
    }

    @DataProvider(name = "womanAge")
    public static Object[][] womanAgeData() {
        return new Object[][]{{59}, {66}, {61}};
    }

    @Test(dataProvider = "manPartner")
    public void testGetManPartner(Person partner) {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person.setPartner(partner);
        Assert.assertEquals(person.getPartner(), partner);
    }
    @DataProvider(name = "manPartner")
    public Object[][] manPartnerData() {
        Person person1 = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        Person person2 = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person1.setFirstName("Alex");
        person2.setFirstName("Mark");

        return new Object[][]{{null}, {person1}, {person2}};
    }
    @Test(dataProvider = "womanPartner")
    public void testGetWomanPartner(Person partner) {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person.setPartner(partner);
        Assert.assertEquals(person.getPartner(), partner);
    }
    @DataProvider(name = "womanPartner")
    public Object[][] womanPartnerData() {
        Person person1 = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        Person person2 = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person1.setFirstName("Mary");
        person2.setFirstName("Anna");

        return new Object[][]{{null}, {person1}, {person2}};
    }
}