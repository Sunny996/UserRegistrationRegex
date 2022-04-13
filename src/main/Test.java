package main;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(Pattern.matches(userRegistration.firstName, "Akash"));
        System.out.println(Pattern.matches(userRegistration.lastName, "Satla"));
        System.out.println(Pattern.matches(userRegistration.email, "akash.satla@gmail.co.in"));
        System.out.println(Pattern.matches(userRegistration.phoneNumber, "91 9676443328"));
<<<<<<< HEAD
=======
        System.out.println(Pattern.matches(userRegistration.password, "ajvjafvc"));
>>>>>>> UC5_PasswordRegexRule1
    }
}
