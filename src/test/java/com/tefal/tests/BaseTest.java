package com.tefal.tests;

import com.codeborne.selenide.Configuration;
import com.tefal.pages.StartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class BaseTest {
    StartPage startPage;
    @BeforeMethod
    public void SetUp () {
        Configuration.baseUrl = "https://tefal-shop.by/";
        open("");
        startPage = new StartPage();
    }
}
