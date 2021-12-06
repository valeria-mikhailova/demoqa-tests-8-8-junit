package com.mikhailovavalery.tests;

import com.mikhailovavalery.domain.RegistrationPageEnum;
import com.mikhailovavalery.pages.RegistrationPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PracticeFormTestsWithPageObjectTestsHomeWork {

    private RegistrationPage registrationPage = new RegistrationPage();

    @CsvSource
            (value = {
                    "1001; 9999999999; Only numbers nine in the number",
                    "1002; 8999523658; Number starts with an eight"
            }, delimiter = ';')
    @ParameterizedTest(name = "Positive test input telephone number with csv source {0}")
    void positiveTestInputTelephoneNumberWithCsvSource(int nomderTestCase,
                                                       String telephoneNomber,
                                                       String nameTelephoneNomder) {
        registrationPage.openPage();
        registrationPage.typeUserNumber(telephoneNomber);
        System.out.println(nomderTestCase + ". " + nameTelephoneNomder);
    }

    //  для всех запустится, кроме MALE
    //  @EnumSource(value = RegistrationPageEnum.class, names = {"MALE"}, mode = EnumSource.Mode.EXCLUDE)
    @EnumSource(RegistrationPageEnum.class)
    @ParameterizedTest(name = "Select sex")
    void selectSex(RegistrationPageEnum registrationPageEnum) {
        registrationPage.openPage();
        registrationPage.switchToSex(registrationPageEnum);
        System.out.println(registrationPageEnum);
    }

    @ParameterizedTest
    @MethodSource("whoIsTester")
    void testWhoIsTesterWithMethodSource(String tester) {
        System.out.println("Tester is: " + tester);
        assertNotNull(tester);
    }

    static Stream<String> whoIsTester() {
        return Stream.of("admin", "Peter", "Alex", "anonymous");
    }
}
















