package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {
    public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath="//thead//tr[1]//th")
    public List<WebElement> headerFirstLineData;

    @FindBy(xpath ="//tbody" )
    public WebElement allBodyWebElement;

    @FindBy(xpath ="//tbody//td")
    public List<WebElement> allBodyDataList;
}
