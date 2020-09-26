package GradleUserRegistration;

import org.junit.Test;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;


public class UserRegistrationTest {
	
	@Test
	public void testFirstName(){
		UserRegistration user_obj = new UserRegistration();
		assertThat(user_obj.firstName("Anne"), CoreMatchers.is("Valid First Name"));
		assertThat(user_obj.firstName("anne"), CoreMatchers.is("Invalid First Name"));
		assertThat(user_obj.firstName("123Anne"), CoreMatchers.is("Invalid First Name"));
		
	}
	
    @Test 
    public void testLastName(){
    	UserRegistration user_obj = new UserRegistration();
    	assertThat(user_obj.lastName("Morgan"),CoreMatchers.is("Valid Last Name"));
    	assertThat(user_obj.lastName("mmmorgan"),CoreMatchers.is("Invalid Last Name"));
	}
    
     @Test 
     public void testEmail(){
    	 UserRegistration user_obj = new UserRegistration();
    	 assertThat(user_obj.email("Emma@abc.com"),CoreMatchers.is("Valid Email"));
    	 
    	 assertThat(user_obj.email(".D@qwe.vom"),CoreMatchers.is("Invalid Email"));
    }
     @Test 
     public void testMob_num(){
    	 UserRegistration user_obj = new UserRegistration();
    	 assertThat(user_obj.mob_num("91 9876543210"),CoreMatchers.is("Valid Mobile Number"));
    	 assertThat(user_obj.mob_num("9876543210"),CoreMatchers.is("Invalid Mobile Number"));
     }
     @Test 
     public void testPassword(){
    	 UserRegistration user_obj = new UserRegistration();
    	 assertThat(user_obj.password("Emma@1234"),CoreMatchers.is("Valid Password"));
    	 assertThat(user_obj.password("mmmm*&^^1234"),CoreMatchers.is("Invalid Password"));
     }
	
}
