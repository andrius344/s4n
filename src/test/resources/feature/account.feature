Feature: As a user, I want to have a form where I can enter my data to create an account

  Scenario Outline: create an account
    When when I am in the form I enter the data
      | name   | last_name   | email   | password   | gender   | birthday   |
      | <name> | <last_name> | <email> | <password> | <gender> | <birthday> |
    Then then I will validate that i am registered

    Examples: 
      | name                  | last_name     | email         | password  | gender | birthday   |
      | andres                | ceballos      | a@hotmail.com | andrius34 | hombre | 1996-02-18 |
      |                       | ceballos      | a@hotmail.com | andrius34 | mujer  | 2008-02-18 |
      | andres                | ceballos      | eadsad.com    | andrius34 | hombre | 1813-02-18 |
      | davidrwerwerwerwerwer | derwerwqerwer |               | andrius34 | mujer  | 1997-02-18 |
      | name                  | lastname      | email         | password  |        | 1997-02-18 |
