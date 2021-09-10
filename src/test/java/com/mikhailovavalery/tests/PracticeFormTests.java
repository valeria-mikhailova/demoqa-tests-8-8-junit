package com.mikhailovavalery.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void TestForm() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Smith");
        $("#userEmail").setValue("a.smith@gmail.com");
        $(".custom-control-label").click();
        $("#userNumber").setValue("a.smith@gmail.com");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("11");
        $(".react-datepicker__year-select").selectOptionByValue("1992");
        $(".react-datepicker__day react-datepicker__day--017").click();
        $(".subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3").setValue("First Subjects");
        $("#hobbies-checkbox-1").click();
        $("#hobbies-checkbox-3").click();


        }



}