import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";
    private final String JOB_TITLE = "Job title";
    private final String Highest_Level_Of_Education = "Highest level of education";
    private final String Highest_Level_Of_Education2 = "Highest level of education";
    private final String Highest_Level_Of_Education3 = "Highest level of education";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "job-title")
    private WebElement job_title;

    @FindBy(id = "radio-button-1")
    private WebElement Highest_level_of_education;

    @FindBy(id = "radio-button-2")
    private WebElement Highest_level_of_education2;

    @FindBy(id = "radio-button-3")
    private WebElement Highest_level_of_education3;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }
    public void enterJobTitle(){
        this.job_title.sendKeys(JOB_TITLE);
    }

    public void HighestLevelOfEducation(){
        this.Highest_level_of_education.click();
    }
    public void HighestLevelOfEducation2(){
        this.Highest_level_of_education2.click();
    }

    public void HighestLevelOfEducation3(){
        this.Highest_level_of_education3.click();
    }


    public void pressSubmitButton(){
        this.submit_button.click();
    }
}
