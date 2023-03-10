package pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MyPages1 {
    public MyPages1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[@id='menu-item-40']")
    public WebElement shopButton;
    @FindBy(xpath="//*[text()='Home']")
    public WebElement homeButton;
    @FindBy(xpath="//*[@class='n2-ss-slide-background-image n2-ss-slide-fill n2-ow']")
    public List<WebElement> sliders;
    @FindBy(xpath="//*[@class='woocommerce-LoopProduct-link']")
    public List<WebElement>arrivals;
    @FindBy(xpath = "//*[@class='product_title entry-title']")
    public WebElement cartTitle;
    @FindBy(xpath = "//*[text()='Description']")
    public WebElement description;
    @FindBy(xpath = "//*[@id='tab-description']")
    public WebElement descriptionText;
}
