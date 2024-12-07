Feature: Login

  Scenario: Verify login on frontaccounting page.
    Given Open browser And open Frontaccounting
    When Clear data of username and password
    And enter username  and password data in username and password field
    Then Verify the title after login
    And Verify that sales Quotation Entry is available.
