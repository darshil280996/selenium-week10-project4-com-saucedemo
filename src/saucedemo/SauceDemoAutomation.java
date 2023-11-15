package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoAutomation {

    public static void main(String[] args) {
        // 1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();

        // 2. Open URL.
        driver.get("https://www.saucedemo.com/");

        // 3. Print the title of the page.
        System.out.println("Title: " + driver.getTitle());

        // 4. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Enter the email to email field.
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("your_username");

        // 7. Enter the password to the password field.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("your_password");

        // 8. Click on Login Button.
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // 9. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 10. Navigate to baseUrl.
        driver.get("https://www.saucedemo.com/");

        // 11. Refresh the page.
        driver.navigate().refresh();

        // 12. Close the browser.
        driver.quit();
    }
}
