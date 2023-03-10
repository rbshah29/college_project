package com.student_bank.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.student_bank.project.classes.model.Registration;

public class registrationTest {

    private Registration createDefaultRegistration() {
        MockDatabase m = new MockDatabase();
        Registration r = new Registration();
        m.registerUser(r);
        return (Registration) m.getRegistration();
    }
@Test
    public void validatePhoneNumberLengthTest() throws Exception{
       Registration r = createDefaultRegistration();
       assertEquals(r.validatePhoneNumberLength(), true);
    }

    @Test
    public void validatePhoneNumberIsDigitTest()throws Exception{
        Registration r = createDefaultRegistration();
        assertEquals(r.validatePhoneNumberIsDigit(), true);
    }

    @Test
    public void validatePasswordContainsDigitTest()throws Exception{
       MockDatabase m= new MockDatabase();
       m.setPassNodigits();
       Registration r = new Registration();
       m.registerUser(r);
       r = (Registration) m.getRegistration();
       assertEquals(r.validatePasswordContainsDigit(), false);
    }

    @Test
    public void validateEmailValidTest()throws Exception{
        Registration r = createDefaultRegistration();
        assertEquals(r.validateEmailValid(), true);
    }

    @Test
    public void validatePasswordContainsLowercaseTest()throws Exception{
        Registration r = createDefaultRegistration();
        assertEquals(r.validatePasswordContainsLowercase(), true);
    }

    @Test
    public void validatePasswordContainsUppercaseTest()throws Exception{
        Registration r = createDefaultRegistration();
        assertEquals(r.validatePasswordContainsUppercase(), true);
    }

    @Test
    public void validatePasswordContainsSpecialTest()throws Exception{
        Registration r = createDefaultRegistration();
        assertEquals(r.validatePasswordContainsSpecial(), true);
    }



}
