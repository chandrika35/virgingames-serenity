package com.virgingames.steps;

import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class VirginGamesSteps {
    @Step("Getting all Jackpots GBP")
    public ValidatableResponse getCurrencyGBP() {
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .queryParam("currency ", "GBP")
                .get(EndPoints.GET_ALL_JACKPOTS_GBP)
                .then().log().all();
    }

    @Step("Getting all Jackpots EUR")
    public ValidatableResponse getCurrencyEUR() {
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .queryParam("currency", "EUR")
                .get(EndPoints.GET_ALL_JACKPOTS_EUR)
                .then().log().all();
    }
//
    @Step("Getting all Jackpots SEK")
    public ValidatableResponse getCurrencySEK() {
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .queryParam("currency", "SEK")
                .get(EndPoints.GET_ALL_JACKPOTS_SEK)
                .then().log().all();

    }
    @Step("Getting all Jackpots id")
    public ValidatableResponse getID() {
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .queryParam("id", "309")
                .get(EndPoints.GET_SINGLE_JACKPOTS_ID)
                .then().log().body();

    }
    }


