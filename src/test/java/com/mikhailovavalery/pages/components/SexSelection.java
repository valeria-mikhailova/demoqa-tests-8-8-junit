package com.mikhailovavalery.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class SexSelection {

    public void setSex() {
        $(".custom-control-label").click();
    }
}
