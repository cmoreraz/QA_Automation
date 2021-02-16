@Stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @scenario1
  Scenario Outline: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
    |strUser|strPassword|
    |<strUser>|<strPassword>|
    When he search for the course on the choucair academy platform
    |strCourse|
    |<strCourse>|
    Then he finds the course called
    |strCourse|
    |<strCourse>|
    
    Examples:
    |strUser|strPassword|strCourse|
    |1023018925|Choucair2021*|Metodología Bancolombia|
