package TestNG.Grouping_Test;

import org.testng.annotations.Test;

public class Payment_test {

    //set priority and multiple groups
    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void Payment_in_dollar(){
        System.out.println("payment with dollar");
    }

    //set priority and groups
    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void Payment_in_taka(){
        System.out.println("payment with BDT");
    }

}
