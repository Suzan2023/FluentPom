package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FluentFacebookRegisterPage {

    private WebDriver ldriver;

    public FluentFacebookRegisterPage(WebDriver driver) {
        ldriver = driver;
    }

    By registerButton = By.xpath("(//a[@role='button'])[2]");
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("reg_email__");
    By password = By.name("reg_passwd__");
    By birthdayDay = By.name("birthday_day");
    By birthdayMonth = By.name("birthday_month");
    By birthdayYear = By.name("birthday_year");
    By femaleRadio = By.xpath("//input[@name='sex'][@value='1']");
    By maleRadio = By.xpath("//input[@name='sex'][@value='2']");
    By customRadio = By.xpath("//input[@name='sex'][@value='-1']");
    By signUpButton = By.name("websubmit");


    public FluentFacebookRegisterPage clickRegister(){
        ldriver.findElement(registerButton).click();
        return this;
    }

    public FluentFacebookRegisterPage enterFirstName(String firstname){
        ldriver.findElement(firstName).sendKeys(firstname);
        return this;
    }

    public FluentFacebookRegisterPage enterLastName(String lastname){
        ldriver.findElement(lastName).sendKeys(lastname);
        return this;
    }

    public FluentFacebookRegisterPage enterEmail(String email){
        ldriver.findElement(this.email).sendKeys(email);
        return this;
    }

    public FluentFacebookRegisterPage enterPassword(String password){
        ldriver.findElement(this.password).sendKeys(password);
        return this;
    }

    public FluentFacebookRegisterPage selectBirthDay(String day){

        Select select = new Select(ldriver.findElement(birthdayDay));
        select.selectByVisibleText(day);
        return this;

    }

    public FluentFacebookRegisterPage selectBirthMonth(String month){
        Select select = new Select(ldriver.findElement(birthdayMonth));
        select.selectByVisibleText(month);
        return this;
    }

    public FluentFacebookRegisterPage selectBirthYear(String year){
        Select select = new Select(ldriver.findElement(birthdayYear));
        select.selectByVisibleText(year);
        return this;
    }


    public FluentFacebookRegisterPage pickGender(String gender){

        switch (gender){
            case "Male":
                ldriver.findElement(maleRadio).click();
                break;
            case "Female":
                ldriver.findElement(femaleRadio).click();
                break;
            case "Custom":
                ldriver.findElement(customRadio).click();
                break;
        }
        return this;

    }

    public void clickSignUpButton(){
        ldriver.findElement(signUpButton).click();
    }


}
