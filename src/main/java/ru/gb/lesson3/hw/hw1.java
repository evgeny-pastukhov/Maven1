package ru.gb.lesson3.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        WebElement searchQuery = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        searchQuery.sendKeys("Shirt");
        WebElement submit = driver.findElement(By.xpath("//*[@name='submit_search']"));
        submit.click();
        driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[2]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();


        Thread.sleep(5000);
        driver.quit();
    }
}
