package manandwomantests;
import dataproviders.TestDataProvider;
import manandwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomanTest {
    private Woman woman;

    @BeforeMethod
    public void creatingWoman(){
        woman = new Woman("Mary", "Smith", 61, null);
    }
    @Test (dataProvider = "womantests", dataProviderClass = TestDataProvider.class)
    public void testIsRetired(int age, boolean expectedAge) {
        woman.setAge(age);
        Assert.assertEquals(woman.isRetired(), expectedAge);
    }
}