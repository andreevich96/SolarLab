Feature: Get information about filtered notifications

  Scenario: Go through the RTS to get information about filtered notifications
    Given Open rts-tender.ru
    When User clicks link to 223 suppliers
    Then User clicks button advanced search
    Then User clicks button settings
    Then User clicks checkbox exclude joint procurement
    Then User clicks checkbox 615-PP RF
    Then User opening modal section date filters
    And User clicks datepicker application submission to
    And User chooses today date
    Then User opening modal section delivery region
    And User clicks checkbox altai region

#    Следующий шаг для теста сценария. Удалить
#    Then Active

#    Следующий шаг для теста сценария. Удалить
    Then User clicks choose all

    Then User clicks button search
    Then Autotest is logging initial price value
#    And Close browser