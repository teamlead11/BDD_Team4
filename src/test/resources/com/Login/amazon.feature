@tag 
Feature: Adding the product to cart and deleting it based on Name 

@deletebasedOnName 
Scenario: Adding the produc to cart and deleting 
	Given I am on Amazon page 
	When Searching the product to add in cart 
	And Deleting the product based on name 
	Then Verify the correct product is deleted 
	
	
