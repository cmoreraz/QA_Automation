@Stories
Feature: Login to the phptravels page

  Background: login to the phptravels page
    Given on the home page Phptravels
    When enter my credentials
      |strEmail|strPassword|
      |admin@phptravels.com|demoadmin|

  Scenario Outline: Create post
    Given Select menu blog phptravels
    When Select submenu post
    And Enter button add post
    Then Enter the form data add the post
      | txtTitle  | txtLink	| txtCont  | txtNameCat  | txtKeywords	| txtDescription  |
      | <txtTitle>|<txtLink>|<txtCont> |<txtNameCat> |<txtKeywords> |<txtDescription>	|
    And Validate post create
    	| txtTitle  |
    	| <txtTitle>|

    Examples: 
       |txtTitle|txtLink|txtCont|txtNameCat|txtKeywords|txtDescription|
       |Categorie 3|2|3|4|5|6|

