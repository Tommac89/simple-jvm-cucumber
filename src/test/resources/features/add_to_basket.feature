Feature: Add to basket
  Scenario: Search for and add item to basket, validating total price
    Given I am on the landing page
    When I search for 'Dress' in the searchbar
    And add a product to the cart: 'Printed Chiffon Dress'
    Then the total cart price is '$18.40'