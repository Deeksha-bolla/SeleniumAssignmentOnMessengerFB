package testcases;
import org.assertj.core.api.SoftAssertions;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import org.testng.Assert;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class Assertions{
    WebDriver driver=null;
    @BeforeMethod
    public void setUp() throws IOException, ParseException {
        String ChromeDriverPath="C:\\software\\selenium\\chromedriver_win32\\chromedriver.exe";
        String loginDataPath="src/main/resources/LoginData.json";
        driver= new ChromeDriver();
        System.getProperty("webdriver.chrome.driver",ChromeDriverPath);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        System.out.println(driver.getTitle());
        FileReader fr =new FileReader(loginDataPath);
        JSONParser parser=new JSONParser();
        Object obj =parser.parse(fr);
        JSONObject jsonObject=(JSONObject)obj;
        String url = (String)jsonObject.get("url");
        System.out.println(url);
        driver.get(url);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void softAssertion() throws IOException, ParseException, InterruptedException {

        String LoginDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr =new FileReader(LoginDataPath);
        JSONParser parser=new JSONParser();
        Object obj =parser.parse(fr);
        JSONObject jsonObject=(JSONObject)obj;
        JSONObject tc=(JSONObject) jsonObject.get("tc01");
        String searchText= (String) tc.get("searchText");
        String searchText1= (String) tc.get("searchText1");
        String expectedMessage= (String) tc.get("expectedMessage");
        String actualMessage="Valid";
        HomePage hp=new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
        SoftAssertions softly = new SoftAssertions();
        System.out.println("Execution Started");
        softly.assertThat(actualMessage).contains(expectedMessage);
        System.out.println("Execution Finished");
        System.out.println(expectedMessage);
    }
    @Test
    public void hardAssertion() throws IOException, ParseException, InterruptedException {
        String LoginDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr =new FileReader(LoginDataPath);
        JSONParser parser=new JSONParser();
        Object obj =parser.parse(fr);
        JSONObject jsonObject=(JSONObject)obj;
        JSONObject tc=(JSONObject) jsonObject.get("tc01");
        String searchText= (String) tc.get("searchText");
        String searchText1= (String) tc.get("searchText1");
        String expectedMessage= (String) tc.get("expectedMessage");
        String actualMessage="Valid";
        HomePage hp=new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
        System.out.println("Execution Started");
        Assert.assertEquals(actualMessage,expectedMessage);
        System.out.println("Execution Finished");
        System.out.println(expectedMessage);
    }
}