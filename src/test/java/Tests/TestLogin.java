package Tests;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class TestLogin extends TestBase {

LoginPage LoginPage1;	
String Username = "Omar";
String Password = "1234";
	
	
@Test
public void LoginFailureTest()
{
	LoginPage1 = new LoginPage(driver);
	LoginPage1.Login(Username, Password);
	assertEquals(LoginPage1.OutputMessage.getText().toString(),"Userid or Password did Not Match !!");
}
	
}
