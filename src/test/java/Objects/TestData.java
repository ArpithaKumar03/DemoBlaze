package Objects;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "signupData")
    public static Object[][] signupData() {
        return new Object[][]{
         
        	{"egruiweyriutwehrhdhbfhiuwehfruewfo", "12345"}
        	};

    }
}
