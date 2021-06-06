package ru.onliner;

import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class Basic {
    public static Basic basic() {
        return new Basic();
    }

    public SelenideElement catalog() {
        return $x("//span[contains (@class, 'b-main-navigation__text')][text()='Каталог']");
    }

    public SelenideElement menuTechnica() {
        return $x("//span[contains (@class, 'catalog-navigation-classifier__item-title-wrapper')]" +
                "[text()='Бытовая техника']");
    }

    public SelenideElement technica() {
        return $x("//*[contains(text(), 'Крупногабаритная техника')]");
    }

    public SelenideElement refrigerators() {
        return $x("//*[contains(text(), 'Холодильники')]");
    }

    public SelenideElement refrigeratorsAtlant() {
        return $x("//ul[contains(@class, 'schema-filter__list')]/li[1]/label/span/input[@value='atlant']//..//span");
    }

    public SelenideElement firstAtlant() {
        return $x("//div[contains (@class, 'schema-products')]/child::div[1]" +
                "//div[contains (@class, 'schema-product__title')]");
    }

    public SelenideElement price() {
        return $x("//div[contains (@class, 'offers-description__price-group')]/div/a");
    }

    public List<String> listOfRefragarators() {
        return $$(("#schema-products")).stream()
                .map(SelenideElement::getText)
                .collect(Collectors.toList());
    }

}
