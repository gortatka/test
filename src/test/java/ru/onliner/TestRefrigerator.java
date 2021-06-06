package ru.onliner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestRefrigerator extends Action {
    private WebDriver webDriver;

    @BeforeClass
    public void openBrowser() {
        open("https://www.onliner.by/");
        clickCatalog();
        clickMenuItemTechnica();
        ckickTechnica();
        ckickRefrigerators();
        selectAtlant();
    }

    @Test
    public void verifyFirstRefrigeratorIsAtlant() {
        Asserts.asserts().verifyFirstRefrigerator(true);
    }

    @Test
    public void verifyPriceAtlant() {
        clickFirst();
        Asserts.asserts().verifyPrice(true);
    }
}
