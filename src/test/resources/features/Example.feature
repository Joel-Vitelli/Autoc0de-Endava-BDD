Feature: Login in underc0de forum

  @ExampleTag
  Scenario Outline: User complete the Form
    Given the user is on the home screen of ToolsQA
    When the user completes the data
      | First Name | Last Name | Email   | Gender   | Mobile   | Hobbies   | Current Address |
      | <fName>    | <lName>   | <email> | <gender> | <mobile> | <hobbies> | <cAddress>      |
    And the user clicks the "Submit" button
    Then the user verifies that the message Thanks for submitting the form appears

    Examples:
      | fName    | lName | email         | gender | mobile     | hobbies | cAddress        |
      | Federico | Test  | test@test.com | Male   | 2341234567 | Music   | Calle Falsa 123 |
      #| Pepa     | Testing | test@test.com | Female | 2613001360 | Sports  | Calle Verdadera 123 |
