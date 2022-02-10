Feature: Get information about filtered notifications

  Scenario: Go through the RTS to get information about filtered notifications
    Given Open rts-tender.ru
    When Press link to 223 suppliers
    Then Press button advanced search
    Then Press button settings
    Then Press checkbox eliminate joint procurement
    Then Press checkbox 615-PP RF
    Then Press opening modal section date filters
    And Press datepicker application submission to
    And Choose today date
    Then Press opening modal section delivery region
    And Press checkbox arkhangelsk region
    Then Press button search
#    And Close browser