package dataproviders;
import manandwoman.Man;
import manandwoman.Person;
import manandwoman.Woman;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

    public class TestDataProvider {
        @BeforeMethod
        public void creatingPerson() {
            Person person = new Person("Alex", "Smith", null, 65) {
                @Override
                public boolean isRetired() {
                    return false;
                }
            };
        }

        @DataProvider(name = "manRetiredData")
        public static Object[][] manRetiredData() {
            Man man1 = new Man("Alex", "Smith", 66, null);
            Man man2 = new Man("Mark", "Reynolds", 66, null);
            Man man3 = new Man("Steve", "Davis", 66, null);
            return new Object[][]{
                    {man1, true},
                    {man2, true},
                    {man3, true}
            };
        }

        @DataProvider(name = "womanTest1")
        public static Object[][] womanRetiredData() {
            Woman woman1 = new Woman("Mary", "Black", 45, null);
            Woman woman2 = new Woman("Anna", "Stabile", 15, null);
            Woman woman3 = new Woman("Angela", "Reynolds", 50, null);
            return new Object[][]{
                    {woman1, false},
                    {woman2, false},
                    {woman3, false}
            };
        }

        @DataProvider(name = "womanTest2")
        public Object[][] womanRegister() {
            return new Object[][]{
                    {new Woman("Alice", "Johnson", 30, null), false},
                    {new Woman("Emma", "Smith", 25, null), true},
            };
        }

        @DataProvider(name = "womanTest3")
        public Object[][] womanDeregister() {
            return new Object[][]{
                    {new Woman("Mary", "Smith", 35, null), true, null, null},
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