package Objects;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "signupData")
    public static Object[][] signupData() {
        return new Object[][]{
         
        	{"dhfujawhfiurehyfiuhaekjfb", "12345"}
        	};

    }
}
