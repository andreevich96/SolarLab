Feature: Checking purchase numbers in the search

  Scenario: Get filtered notifications and check them in search
    Given Open rts-tender.ru search 223
    When User clicks button settings
    Then User clicks checkbox exclude joint procurement
    Then User clicks checkbox 615-PP RF
    Then User opening modal section date filters
    And User clicks datepicker application submission to
    And User chooses today date
    Then User opening modal section delivery region
    And User clicks checkbox altai region
#    Следующий шаг для теста сценария. (в случае малого кол-ва извещений). Удалить
    Then User clicks choose all
    Then User clicks button search
    Then Autotest collects purchase numbers
    And  Autotest searches for the notification number in the search, comparing the request with the result
#    And Close browser