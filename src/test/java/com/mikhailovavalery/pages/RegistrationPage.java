package com.mikhailovavalery.pages;

import com.codeborne.selenide.SelenideElement;
import com.mikhailovavalery.pages.components.CalendarComponent;
import com.mikhailovavalery.pages.components.SexSelection;
import com.mikhailovavalery.pages.components.SubjectsContainer;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";

    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber");
 //           subjectsContainer =  $("#subjectsContainer");

    public CalendarComponent calendar = new CalendarComponent();
    public SexSelection male = new SexSelection();
    public SubjectsContainer subject = new SubjectsContainer();

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage typeUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public void checkResultsValue(String key, String value) {
        $x("//td[text()='" + key + "']").parent().shouldHave(text(value));
    }






}
