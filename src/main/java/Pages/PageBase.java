package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
public JavascriptExecutor jes;
public Actions action;


public PageBase(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public static void clickBtn(WebElement button)
{
	button.click();
}

public static void fillTextBox(WebElement TextBox, String text)
{
	TextBox.sendKeys(text);
}

public void scrollToBottom()
{
	jes.executeScript("scrollBy(0,2500)");
}

public void hover(WebElement element)
{
	action.moveToElement(element).build().perform();
}

public void hoverClick(WebElement element)
{
	action.moveToElement(element).click().build().perform();
}


}
