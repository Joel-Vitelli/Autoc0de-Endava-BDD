package com.autoc0de.pages;

import com.core.utility.MasterPage;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;

import static com.autoc0de.locators.ExampleLocators.*;
import static com.core.driver.DriverFactory.driver;

public class ExamplePage extends MasterPage {

    public void navigateToMainURL(){
        auto_openURLInBrowser(BASE_URL);
    }

    public void loadData(DataTable listData) {
        auto_setTextToInput(FIRST_NAME_ID,getDatafromMap(listData,"First Name"));
        auto_setTextToInput(LAST_NAME_ID,getDatafromMap(listData,"Last Name"));
        auto_setTextToInput(EMAIL_NAME_ID,getDatafromMap(listData,"Email"));
        selectGender(getDatafromMap(listData,"Gender").toLowerCase());
        auto_setTextToInput(MOBILE_ID,getDatafromMap(listData,"Mobile"));
        selectHobbie(getDatafromMap(listData,"Hobbies").toLowerCase());
        uploadPic();
        auto_setTextToInput(CURRENT_ADRESS_ID,getDatafromMap(listData,"Current Address"));
    }

    public void selectGender(String gender){
        if (gender.contains("male")){
            auto_setClickElementActions(MALE_GENDER_RADIO_ID);
        } else {
            auto_setClickElementActions(FEMALE_GENDER_RADIO_ID);
        }
    }

    public void selectHobbie(String hobbie){
        if (hobbie.contains("sports")){
            auto_setClickElementActions(SPORT_HOBBIE_CHECK_ID);
        } else {
            auto_setClickElementActions(MUSIC_HOBBIE_CHECK_ID);
        }
    }

    public void uploadPic(){
        File f = new File("img/autoc0de-2-0.png");
        auto_setTextToInputRaw(UPLOAD_PIC_ID, f.getAbsolutePath());
    }

    public String getDatafromMap(DataTable testData, String keyName) {
        return (String) testData.asMaps(String.class, String.class).get(0).get(keyName);
    }

    public void clickSumbitBtn(){
        auto_setClickElementJS(BTN_SUBMIT_ID);
    }

    public void verifyMessaje(String messaje){
        auto_waitForElementVisibility(H4_SUBMIT_ID);
        Assert.assertEquals(auto_getElementText(H4_SUBMIT_ID),messaje,"The form was faild");
    }
}
