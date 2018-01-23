@tag 
Feature: Adding the product to cart and deleting it based on Name 

@deleteBasedOnPrice 
Scenario: Adding the produc to cart and deleting 
	Given I am on Amazon home page
	When Searching the product to add in cart and Adding
	And Deleting the product based on price
	Then Verify whether the correct product is deleted 