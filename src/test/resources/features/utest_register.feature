# Autor: leider tanos
@stories
Feature: Utest Record
  I want to register as a user on the Utest platform

  @scenario1

  Scenario Outline: Leader registration on the Utest page

    Given which leider wants to register on the Utest page
    When leider enters the registration data
    | firtName | lastName | emailAddress           | birthMonth | birthDay | birthYear | password      | confirmPassword    |
    | <firtName> | <lastName> | <emailAddress>     | <birthMonth> | <birthDay> | <birthYear> | <password>      | <confirmPassword>    |
    Then He verifies the <message> on the screen
    Examples:
      | firtName | lastName | emailAddress           | birthMonth | birthDay | birthYear | password      | confirmPassword    | message |
      | jose   | ortiz    | jose.ortiz@mail.com | October    | 5       | 1991             | Realmadrid02. | Realmadrid02.      | Welcome to the world's largest community of freelance software testers! |
      | arturo   | estrella  | arturo2@mail.com | October    | 7        | 1990            | Realmadrid01. | Realmadrid01.      | Welcome to the world's largest community of freelance software testers! |