package main;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(Pattern.matches(userRegistration.firstName, "Akash"));
        System.out.println(Pattern.matches(userRegistration.lastName, "Satla"));
        System.out.println(Pattern.matches(userRegistration.email, "akash.satla@gmail.co.in"));
        System.out.println(Pattern.matches(userRegistration.phoneNumber, "91 9676443328"));
        System.out.println(Pattern.matches(userRegistration.password, "Ajv12@jafvc"));

    }

    @Test
    public void givenSomeEmailSamplesShoudlClearThemAll() {
        UserRegistration userRegistration = new UserRegistration();
        String email = userRegistration.email;
        String[] trueArray = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
                "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] falseArray = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com"
                , "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        boolean flag1 = true;
        for (String str : trueArray) {
            if (!str.matches(userRegistration.email))
                flag1 = false;
        }
        boolean flag2 = true;
        for (String st : falseArray) {
            if (st.matches(userRegistration.email))
                flag2 = false;
        }
        Assert.assertTrue(flag1 && flag2);
    }
}
