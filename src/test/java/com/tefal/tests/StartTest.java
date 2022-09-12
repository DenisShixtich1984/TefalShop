package com.tefal.tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class StartTest extends BaseTest{
    @Test
    public void firstTest () {
        startPage.titleTefal.shouldBe(visible);
    }
}
