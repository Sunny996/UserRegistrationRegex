package main;

public class UserRegistration {
    public String firstName = "^[A-Z]{1}[A-Za-z]{2}.*";
    public String lastName = "^[A-Z]{1}[A-Za-z]{2}.*";
<<<<<<< HEAD
    public String email = "^[a-z0-9_+-]+((\\.)[a-z0-9]+)?(@)[a-z0-9]+(\\.)[a-z]{2,4}(\\.)[a-z]{2,4}$";
    public String phoneNumber = "^[0-9]{1,3} [0-9]{10}$";
=======
    public String email = "^[a-z0-9_+-]+((\\.)[a-z0-9]+)?(\\@)[a-z0-9]+(\\.)[a-z]{2,4}((\\.)[a-z]{2,4})?$";
    public String phoneNumber = "^[0-9]{1,3} [0-9]{10}$";
    public String password = "^[A-Za-z]{8,}$";
>>>>>>> UC5_PasswordRegexRule1

}
