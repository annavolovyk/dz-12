package manandwomantests;
import manandwoman.Man;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManTest {
@Test(dataProvider = "mantests", description = "Verifying the age for retirement", priority = 10)
    public void testIsRetired(int age, boolean canRetire) {
        Man man = new Man();
        man.setAge(age);
        boolean ageNow = man.isRetired();
        Assert.assertEquals(ageNow, canRetire);
    }

    @DataProvider(name = "mantests")
    public static Object[][] manAgeData(){
        return new Object[][]{{60, false}, {66, true}, {65, false}};
    }
}
