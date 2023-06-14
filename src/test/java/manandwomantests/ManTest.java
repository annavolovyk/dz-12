package manandwomantests;
import dataproviders.TestDataProvider;
import manandwoman.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManTest {
    private Man man;

    @Test(dataProvider = "manRetiredData", dataProviderClass = TestDataProvider.class)
    public void testSetRetired(Man man, boolean expectedIsRetiredResult) {
        Assert.assertEquals(man.isRetired(), expectedIsRetiredResult, "Check the age for retirement");
    }
}
