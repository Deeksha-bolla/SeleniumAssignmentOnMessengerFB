package testcases;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import java.util.concurrent.TimeUnit;


class TestCasevalid1 {
    WebDriver driver=null;
    @BeforeMethod
    public void setUp(){
        String url = "https://www.facebook.com/";
        String chromeDriverPath = "C:\\software\\selenium\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("WebDriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get(url);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void searchComputerUsingAlphabet() throws InterruptedException {
//try{
        String searchText="8688055719";
        String searchText1="Selenium@1234";
        String expectedMessage = "Valid";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);

    }
}
