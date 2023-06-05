package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.FacebookRegisterPage;

import java.time.Duration;

public class TestA {



    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.facebook.com/");

        FacebookRegisterPage registerPage = new FacebookRegisterPage(driver);

        registerPage.clickRegister();
        registerPage.enterFirstName("Karl");
        registerPage.enterLastName("Ortis");
        registerPage.enterEmail("karl@clarus.com");
        registerPage.enterPassword("Aa123456.");
        registerPage.selectBirthDay("11");
        registerPage.selectBirthMonth("May");
        registerPage.selectBirthYear("1980");
        registerPage.pickGender("Male");
        registerPage.clickSignUpButton();

    }
}
