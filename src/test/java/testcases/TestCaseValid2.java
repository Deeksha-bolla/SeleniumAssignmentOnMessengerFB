package testcases;


import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;


public class     TestCaseValid2 {
    WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws IOException, ParseException {
        String chromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver.exe";
        String loginDataPath = "src/main/resources/LoginData.json";
        System.setProperty("webDriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        FileReader fr = new FileReader(loginDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        String url = (String) jsonObject.get("url");
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void validCred() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc01");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "Valid";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(1000);
    }

    @Test
    public void invalidCred() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc02");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "Invalid";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void validUid() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc03");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "Valid Username and Invalid password";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void invalidUid() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc04");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "InValid Username and valid password";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void blankUid() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc05");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "Blank Username and valid password";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void blankpwd() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc06");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "Valid Username and blank password";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void blankidpwd() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc07");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "blank Username and blank password";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void validIdBlankPwd() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc08");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "valid Username and blank password";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void blankUidInvalidPwd() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc09");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "blank Username and invalid password";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void invalidIdBlankpwd() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("tc10");
        String searchText = (String) tc.get("searchText");
        String searchText1 = (String) tc.get("searchText1");
        String expectedMessage = "invalid Username and blank password";
        System.out.println(expectedMessage);
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
}
