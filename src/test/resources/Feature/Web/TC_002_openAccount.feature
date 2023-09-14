Feature: Open Account
  @Smoke1
  Scenario Outline: Opening Account
    Given User goto Open Account tab
    When User click Customer dropdown
    And Select created account
    And User click Currency dropdown
    And Select a Currency
    And User click on Process button
    Then Handle popup
    Examples:
      |Customer| Currency |
      |Martin Rozario| Dollar |
