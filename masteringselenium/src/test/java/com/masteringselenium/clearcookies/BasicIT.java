package com.masteringselenium.clearcookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BasicIT extends DriverBase {

    private ExpectedCondition<Boolean> pageTitleStartsWith(final String searchString) {

        return driver -> driver.getTitle().toLowerCase().startsWith(searchString.toLowerCase());

    }

    private void googleExampleThatSearchesFor(final String searchString) {

        WebDriver driver = DriverBase.getDriver();

        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));

        searchField.clear();

        searchField.sendKeys(searchString);

        System.out.println("Page title is: " + driver.getTitle());

        searchField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10, 100);

        wait.until(pageTitleStartsWith(searchString));

        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test(groups = {"current"})
    public void googleCheeseExample() {
        googleExampleThatSearchesFor("Cheese!");
    }

    @Test(groups = {"current"})
    public void googleMilkExample() {
        googleExampleThatSearchesFor("Milk!");
    }

    @Test(groups = {"current"})
    public void goCardinalExample() {
        googleExampleThatSearchesFor("Cardinal!");
    }

    @Test(groups = {"current"})
    public void goCrimsonExample() {
        googleExampleThatSearchesFor("Crimson!");
    }

    @Test(groups = {"current"})
    public void goLionsExample() {
        googleExampleThatSearchesFor("Lions!");
    }



    @Test(groups = {"current"})
    public void ramsExample() {
        googleExampleThatSearchesFor("Rams!");
    }

    @Test(groups = {"current"})
    public void cubsExample() {
        googleExampleThatSearchesFor("Cubs!");
    }

    @Test(groups = {"current"})
    public void patriotsExample() {
        googleExampleThatSearchesFor("PATRIOTS!");
    }

    @Test(groups = {"current"})
    public void jaguarsExample() {
        googleExampleThatSearchesFor("JAGUARS!");
    }

    @Test(groups = {"current"})
    public void dolphinsExample() {
        googleExampleThatSearchesFor("Dolphins!");
    }
}