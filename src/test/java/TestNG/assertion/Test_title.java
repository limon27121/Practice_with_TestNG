package TestNG.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_title {

    @Test
    void testcase01(){
        String actual_string="open_cart";
        String expected_string="close_cart";
        Assert.assertEquals(actual_string,expected_string);
    }
    @Test
    void testcase02(){
        String actual_string="open_cart";
        String expected_string="close_cart";
        Assert.assertNotEquals(actual_string,expected_string);
    }

}
