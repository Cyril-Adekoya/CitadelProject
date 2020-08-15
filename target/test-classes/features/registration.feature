Feature: Giftrete Registration
  @CitadelTest
  Scenario: Valid Registration
    Given I have lunched the Giftrete Website url
    When I entered a valid user details
    Then I should received a succesfully registration message