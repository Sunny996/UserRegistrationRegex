package main;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(Pattern.matches(userRegistration.firstName,"Akash"));
    }
    public String firstName = "^[A-Z]{1}[A-Za-z]{2}.*";

}
