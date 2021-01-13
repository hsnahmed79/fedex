Feature: Coupon Handle Test


@GetCoupon
  Scenario: User should be able to handle coupon
    Given Customer launch in FedEx Home Page
    When Customer click on Design and Print
    And Customer click on Get Coupon and Deals
    And Click on Get Coupon of Take $2 off passport photos
    Then User can see the coupon of $2 off
