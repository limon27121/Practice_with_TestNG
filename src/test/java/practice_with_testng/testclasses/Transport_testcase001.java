package practice_with_testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice_with_testng.pageobject.Transport;

public class Transport_testcase001 extends base_class {

    Transport t1=new Transport(driver);

    @Test
    public void transport(){

        t1=new Transport(driver);
        t1.transport();
        Assert.assertTrue(t1.transport_body.isDisplayed());

    }

}
