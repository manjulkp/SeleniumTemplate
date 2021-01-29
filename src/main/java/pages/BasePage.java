package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {
	protected WebDriver webDriver;
    
    public BasePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}	
    
    protected void click(WebElement webElement) {
    	webElement.click();
    }
    
    protected void populateField(WebElement webElement, String text) {
    	webElement.sendKeys(text);
    }
    
    /**
     * Selects an option from a dropdown field by its VALUE, e.g
     * {@code <option value="VALUE">some text</option>} 
     * @param webElement
     * @param value
     */
    protected void selectFromDropdownByValue(WebElement webElement, String value) {
    	if (value != null) {
    		Select select = new Select(webElement);
    		select.selectByValue(value);
		}
    }
    
    /**
     * Selects an option from a dropdown field by its visible TEXT, e.g
     * {@code <option value="some value">TEXT</option>} 
     * @param webElement
     * @param text
     */
    protected void selectFromDropdownByText(WebElement webElement, String text) {
    	if (text != null) {
    		Select select = new Select(webElement);
        	select.selectByVisibleText(text);
		}
    }
    
    protected void selectCheckbox(WebElement webElement) {
    	if (!isSelected(webElement)) {
			click(webElement);
		}
    }
    
    protected boolean isSelected(WebElement webElement) {
    	return webElement.isSelected();
    }
    
    protected boolean isPresent(WebElement webElement) {
    	return webElement.isDisplayed();
    }
}
