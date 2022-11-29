package com.autoc0de.locators;

import com.core.utility.PropertyFileReader;

public class ExampleLocators {

    public static final String BASE_URL = PropertyFileReader.getProperty("url");
    public static final String FIRST_NAME_ID = "id:firstName";
    public static final String LAST_NAME_ID = "id:lastName";
    public static final String EMAIL_NAME_ID = "id:userEmail";
    public static final String MALE_GENDER_RADIO_ID = "xpath://input[@id='gender-radio-1']";
    public static final String FEMALE_GENDER_RADIO_ID = "xpath://input[@id='gender-radio-1']";
    public static final String MOBILE_ID = "id:userNumber";
    public static final String SPORT_HOBBIE_CHECK_ID = "id:hobbies-checkbox-1";
    public static final String MUSIC_HOBBIE_CHECK_ID = "id:hobbies-checkbox-3";
    public static final String UPLOAD_PIC_ID = "id:uploadPicture";
    public static final String CURRENT_ADRESS_ID = "id:currentAddress";
    public static final String STATE_DROPBOX_XPATH = "xpath:(//div[@class=' css-1hwfws3'])[1]";
    public static final String CITY_DROPBOX_XPATH = "xpath:(//div[@class=' css-1hwfws3'])[2]";
    public static final String LIST_STATE_ITEM_XPATH = "xpath://div[contains(@id,'react-select-3-option')]";
    public static final String LIST_CITY_ITEM_XPATH = "xpath://div[contains(@id,'react-select-4-option')]";
    public static final String BTN_SUBMIT_ID = "id:submit";
    public static final String H4_SUBMIT_ID = "xpath://div[@class='modal-title h4']";

}