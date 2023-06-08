package dataproviders;
import org.testng.annotations.DataProvider;

    public class TestDataProvider {
        @DataProvider(name = "mantests")
        public Object[][] manAgeData() {
            return new Object[][]{
                    {60, false},
                    {64, false}};
        }
        @DataProvider(name = "womantests")
        public Object[][] womanAgeData() {
            return new Object[][]{
                    {59, false},
                    {66, true},
                    {61, true}};
        }
        @DataProvider(name = "deregister")
        public Object[][] returnToOldLastNameData() {
            return new Object[][]{
                    {true, "Black"},
                    {false, "Smith"}
            };
        }

        @DataProvider(name = "personTestData")
        public Object[][] personTestData() {
            return new Object[][]{
                    {"Alex", "Smith", null, 65},
                    {"Mark", "Reynolds", null, 63},
                    {"Mary", "Black", null, 61}
            };
        }
    }
