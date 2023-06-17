package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import com.virgingames.steps.VirginGamesSteps;
import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(SerenityRunner.class)
public class VirginGamesTest extends TestBase {
    @Steps
    VirginGamesSteps virginGamesSteps;

    @Test
    @Title("This will generate the data with currency GBP")
    public void test001() {
        virginGamesSteps.getCurrencyGBP().statusCode(200);
    }

    @Test
    @Title("This will generate the data with currency EUR")
    public void test002() {
        virginGamesSteps.getCurrencyEUR().statusCode(200);
    }

    @Test
    @Title("This will generate the data with currency SEK")
    public void test003() {
        virginGamesSteps.getCurrencySEK().statusCode(200);

    }


}

