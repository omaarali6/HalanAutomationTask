package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(id = "ctl00_CPHContainer_txtUserLogin")
WebElement IdTextBox;

@FindBy(id = "ctl00_CPHContainer_txtPassword")
WebElement PassTextBox;

@FindBy(id = "ctl00_CPHContainer_btnLoginn")
WebElement LoginBtn;

@FindBy(css = "span.lblboxerror")
public WebElement OutputMessage;



public void Login(String username, String password)
{
	IdTextBox.sendKeys(username);
	PassTextBox.sendKeys(password);
	clickBtn(LoginBtn);
}

}
