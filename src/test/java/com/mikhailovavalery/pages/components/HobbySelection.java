package com.mikhailovavalery.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class HobbySelection {
    public void setHobby() {
        $("[for='hobbies-checkbox-2']").click();
        }
    }
