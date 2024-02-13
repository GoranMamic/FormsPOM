package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forms extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
        homePage.clickOnCard("Forms");
        sidebarPage.clickOnSidebarButton("Practice Form");
    }

    @Test
    public void userCanFillFormWithJustMandatoryFields() {
        practiceFormPage.inputFirstName("John");
        practiceFormPage.inputLastName("Smith");
        practiceFormPage.chooseGender();
        practiceFormPage.inputMobileNumber("1231231231");
        practiceFormPage.clickOnSubmit();
    }

    @Test
    public void userCanFillFormWithAllFields() {
        practiceFormPage.inputFirstName("John");
        practiceFormPage.inputLastName("Smith");
        practiceFormPage.inputEmail("mail@mail.com");
        practiceFormPage.inputDateOfBirth("June", "1990", "11");
        practiceFormPage.chooseGender();
        practiceFormPage.inputMobileNumber("1231231231");
        practiceFormPage.clickOnSubmit();
    }

    @Test
    public void userCanFillFormWithExcelFile() {
        String firstName = excelReader.getStringData("Forms", 1, 0);
        String lastName = excelReader.getStringData("Forms", 1, 1);
        String email = excelReader.getStringData("Forms", 1, 2);
        String mobile = String.valueOf(excelReader.getIntegerData("Forms", 1, 3));


        practiceFormPage.inputFirstName(firstName);
        practiceFormPage.inputLastName(lastName);
        practiceFormPage.inputEmail(email);
        practiceFormPage.chooseGender();
        practiceFormPage.inputMobileNumber(mobile);
        practiceFormPage.clickOnSubmit();
    }

}
