package manandwomantests;
import dataproviders.TestDataProvider;
import manandwoman.Man;
import manandwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {
    private Woman woman;

    @Test(dataProvider = "womanTest1", dataProviderClass = TestDataProvider.class)
    public void testSetRetired(Woman woman, boolean expectedIsRetiredResult) {
        Assert.assertEquals(woman.isRetired(), expectedIsRetiredResult, "Check the age for retirement");
    }

    @Test(dataProvider = "womanTest2", dataProviderClass = TestDataProvider.class)
    public void registerPartnership_shouldCheckIfWomanHasNoPartner(Woman woman, boolean expectedHasNoPartner) {
        if (expectedHasNoPartner) {
            Assert.assertEquals(woman.getPartner(), null, "Has no partner");


        }
    }
    @Test(dataProvider = "womanTest3", dataProviderClass = TestDataProvider.class)
    public void selectOldLastName(Woman woman, boolean returnToOldLastName, String oldLastName, String expectedLastName) {
        woman.setOldLastName(oldLastName);
        woman.deregisterPartnership(returnToOldLastName);
        Assert.assertEquals(woman.getLastName(), expectedLastName);
    }
}