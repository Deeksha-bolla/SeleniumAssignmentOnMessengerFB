package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCaseValidCreateUser {
    public static void main(String[] args) throws InterruptedException {
        String ChromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Rakshitha");
        driver.findElement(By.name("lastname")).sendKeys("Kashyap");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8897556156");
        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Rakshitha123");
        driver.findElement(By.xpath("//option[text()='3']")).click();
        driver.findElement(By.xpath("//option[text()='Feb']")).click();
        driver.findElement(By.xpath("//option[text()='2002']")).click();
        driver.findElement(By.cssSelector("input[value='1']")).click();
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    }
}
