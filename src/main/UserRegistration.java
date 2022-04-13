package main;

public class UserRegistration {
    public String firstName = "^[A-Z]{1}[A-Za-z]{2}.*";
    public String lastName = "^[A-Z]{1}[A-Za-z]{2}.*";
    public String email = "^[a-z0-9_+-]+((\\.)[a-z0-9]+)?(\\@)[a-z0-9]+(\\.)[a-z]{2,4}((\\.)[a-z]{2,4})?$";

}
