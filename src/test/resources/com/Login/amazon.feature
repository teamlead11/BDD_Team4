@tag 
Feature: Adding the product to cart and deleting it based on Name 

@adding  
Scenario:@deletebasedOnName 
	Given I am on Amazon page 
	When Searching the product to add in cart 
	Then Verify the correct product is deleted 
	
	
