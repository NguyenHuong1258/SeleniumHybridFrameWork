@facebook
Feature: Login in to facebook account
  Existing user should be able to login into account using correct credentials

  Background:
    Given User navigate to login page of facebook.com with url "https://www.facebook.com/"
    And Login page is loaded

    Scenario: [UI] User is able to login and post status on facebook - [TC01]
      When Login to Facebook with user email: "mailtam54@gmail.com" and password: "VitalQIP@123"
      Then Facebook homepage is display
