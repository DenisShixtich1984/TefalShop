package com.tefal.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class StartPage {
    public SelenideElement titleTefal = $(byText("Официальный интернет-магазин"));
    public SelenideElement ultimateButton = $x("//*[@id='content_wrapper']/div[1]/div/a[1]/div[2]/img");
    public SelenideElement ultimateTitle = $x("//h1");


    public StartPage clickUltimateButton () {
        ultimateButton.click();
        return this;
    }




}
