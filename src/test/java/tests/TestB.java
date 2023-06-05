package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.FluentFacebookRegisterPage;

import java.time.Duration;

public class TestB {


    @Test
    public void withFluentPOM(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");

        FluentFacebookRegisterPage frp = new FluentFacebookRegisterPage(driver);

        frp.clickRegister().
                enterFirstName("Karl").
                enterLastName("Ortis").
                enterEmail("karl@clarus.com").
                enterPassword("Aa123456.").
                selectBirthDay("11").
                selectBirthMonth("May").
                selectBirthYear("1980").
                pickGender("Male").
                clickSignUpButton();

    }
}