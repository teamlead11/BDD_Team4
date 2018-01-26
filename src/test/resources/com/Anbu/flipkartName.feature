@tag 
Feature: Adding the product to cart and deleting it based on Name 

@deletebasedOnName 
Scenario: Adding the produc to cart and deleting 
	Given I am on flipkart page 
	When Search the product to add in cart 
	And Delete the product based on name 
	Then Verify whether the product is deleted
