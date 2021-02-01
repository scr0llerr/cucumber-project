Feature: Вход в системата

  Scenario: Потребител с пълен гараж
    Given Потребителят отваря екрана с вход в системата
    When Въвежда потребителско име "Ivan"
    And Въвежда парола "Pass"
    And Въвежда място в гаража "true"
		And Натиска бутона за вход в системата
    Then Вижда съобщение "Потребителят е с пълен гараж"
    
    Scenario: Потребител с една кола в гаража
    Given Потребителят отваря екрана с вход в системата
    When Въвежда потребителско име "Ivan1"
    And Въвежда парола "Pass1"
		And Натиска бутона за вход в системата
    Then Вижда съобщение "Потребителят има място в гаража или няма такъв"
    
     Scenario: Потребител с повече от една кола в гаража
    Given Потребителят отваря екрана с вход в системата
    When Въвежда потребителско име "Ivan2"
    And Въвежда парола "Pass2"
		And Натиска бутона за вход в системата
    Then Вижда съобщение "Потребителят има място в гаража или няма такъв"
    
     Scenario: Потребител без коли в гаража
    Given Потребителят отваря екрана с вход в системата
    When Въвежда потребителско име "Ivan3"
    And Въвежда парола "Pass3"
		And Натиска бутона за вход в системата
    Then Вижда съобщение "Потребителят има място в гаража или няма такъв"
    
     Scenario: Потребител без гараж
    Given Потребителят отваря екрана с вход в системата
    When Въвежда потребителско име "Ivan4"
    And Въвежда парола "Pass4"
		And Натиска бутона за вход в системата
    Then Вижда съобщение "Потребителят има място в гаража или няма такъв"
