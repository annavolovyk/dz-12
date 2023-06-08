package manandwomantests;
import dataproviders.TestDataProvider;
import manandwoman.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManTest {
    private Man man;

    @BeforeMethod
    public void creatingMan() {
        man = new Man("Alex", "Smith", 65, null);
    }

    @Test(dataProvider = "mantests", dataProviderClass = TestDataProvider.class)
    public void testIsRetired(int age, boolean expectedAge) {
        man.setAge(age);
        Assert.assertEquals(man.isRetired(), expectedAge);
    }
}
