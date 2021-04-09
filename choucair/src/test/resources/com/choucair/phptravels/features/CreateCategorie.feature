@Stories
Feature: Login to the phptravels page

  Background: login to the phptravels page
    Given on the home page Phptravels
    When enter my credentials
      |strEmail|strPassword|
      |admin@phptravels.com|demoadmin|

  Scenario Outline: Create categorie
    Given Select menu blog
    When Select submenu blog categories
    And Enter button add categorie
    Then Enter the form data and add the category
      | txtName  | txtTurkish	| txtArabic  | txtGerman  | txtVietnamese	| txtSpanish  | txtRussian | txtFarsi	| txtFrench  |
      | <txtName>|<txtTurkish>|<txtArabic> |<txtGerman>	|<txtVietnamese>|<txtSpanish>	|<txtRussian>|<txtFarsi>|<txtFrench> |
    And Validate categorie create
    	| strNameCategorie  |
      | <strNameCategorie> |

    Examples: 
       |txtName|txtTurkish|txtArabic|txtGerman|txtVietnamese|txtSpanish|txtRussian|txtFarsi|txtFrench|strNameCategorie|
       |Categorie 3|2|3|4|5|6|7|8|9|Categorie 3|

