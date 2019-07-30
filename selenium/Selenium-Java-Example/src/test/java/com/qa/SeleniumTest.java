package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class SeleniumTest {
    private ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Harley\\Desktop\\chromedriver.exe"
        );
        driver = new ChromeDriver();
    }

    @Test
    public void exampleSeleniumTest() {
        try {
            driver.manage().window().maximize();
            driver.get("http://localhost:3000");
            Thread.sleep(500);
            WebElement element = driver.findElement(By.name("mr-sm-2"));

            assertTrue(element.isDisplayed());

            element.sendKeys("funny cat pics");
            Thread.sleep(500);
            driver.findElement(By.name("navhov")).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
