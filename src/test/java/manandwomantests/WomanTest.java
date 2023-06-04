package manandwomantests;
import manandwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WomanTest {
    @Test(dataProvider = "womantests", description = "Verifying the age for retirement", priority = 10)
    public void testIsRetired(int age, boolean canRetire) {
        Woman woman = new Woman();
        woman.setAge(age);
        boolean ageNow = woman.isRetired();
        Assert.assertEquals(ageNow, canRetire);
    }
    @DataProvider(name = "womantests1")
    public static Object[][] womanAgeData(){
        return new Object[][]{{59, false}, {66, true}, {61, true}};
    }
    @Test(dataProvider = "deregister")
    public void testDeregisterPartnership(boolean returnToOldLastName, String womanLastName) {
        Woman woman = new Woman();
        woman.setLastName("Black");
        woman.deregisterPartnership(returnToOldLastName);
        Assert.assertEquals(woman.getLastName(), womanLastName);
    }
    @DataProvider(name = "deregister")
    public Object[][] returnToOldLastNameData() {
        return new Object[][]{
                {true, "Black"},
                {false, "Smith"}
        };
    }
}