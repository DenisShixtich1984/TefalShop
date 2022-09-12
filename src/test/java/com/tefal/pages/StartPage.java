package com.tefal.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StartPage {
    public SelenideElement titleTefal= $(byText("Официальный интернет-магазин"));

}
