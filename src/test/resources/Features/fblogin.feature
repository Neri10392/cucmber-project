Feature: Verifying fb login details

  Scenario: Verifying fb login valid credentials
    Given User should in fb login page
    When User should enter
      | neri1234   |   12345 |
      | vijay45678 | 4567890 |
      | mani456782  | ty5678  |
