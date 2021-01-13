Feature: Verify navigate back and forth among pages


@NavigateBackAndForth
  Scenario: Validate navigate back and forth and scroll down among pages
    Given Customer launch in FedEx Home Page “https://www.fedex.com/en-us/home.html”
    When Customer click on About FedEx
    And Customer click on see full history
    And scroll down
    And Click on Back
    And Click on forward
    And Click on Back
    Then User can see the home page
