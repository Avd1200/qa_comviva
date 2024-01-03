package emailAssertions;

import emailValidation.EmailValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEmail {
    @Test
    public void checkEmail(){
        EmailValidator email = new EmailValidator();
        assertTrue(email.isValidEmail("avd@gmail.com"));
        String email1 = "comviva@company.com";
        assertTrue(email.isValidEmail(email1) && email.isCorporateEmail(email1),"Email is either invalid or non-corporate");
    }
}
