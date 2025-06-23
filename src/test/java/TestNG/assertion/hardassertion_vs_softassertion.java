package TestNG.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardassertion_vs_softassertion {

    @Test
    void hard_assertion(){
        System.out.println("line01");
        System.out.println("line02");
        Assert.assertEquals(1,2);
        System.out.println("line03");
        System.out.println("liine04");
    }

    @Test
    void soft_assertiion(){
        System.out.println("line01");
        System.out.println("line02");
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(1,2);
        System.out.println("line03");
        System.out.println("liine04");
        //mandatory
        sa.assertAll();
    }
}
