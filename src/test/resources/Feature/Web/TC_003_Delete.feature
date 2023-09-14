Feature: Delete Customer
  @Smoke1
  Scenario Outline:Deleting Customer
    Given Click Customer Tab
    When User input for search '<name>'
    Then User click on the Delete button


    Examples:
      |name |
      |Martin |