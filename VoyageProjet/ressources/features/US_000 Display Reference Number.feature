#Author: marina.kayrouz@dauphine.eu, zahra.ayache@dauphine.eu
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: US_000 Display the details of the travel 

As a User, 
I would like to be able to see the details of the travel when I choose my departure country, destination country and travel mode. 

  @tag1
  Scenario: Display the details of the travel when validated
    Given a departure country  using <countryDepart> 
    And a country of destinantion  using <availableCountry>
    And a travel Mode uisng <travelMode>
    When a user validate the travel
    Then display the details of the travel using <price> and <referenceNumber>
  
  Examples: 
  
       countryDepart | availableCountry  | travelModes | price | status   | referenceNumber
       Greece        | Afghanistan       | airplane    | 1300  | validate | FO356
      
    
  @tag2
  Scenario Outline: Refuse a travel
    Given a departure country  using <countryDepart> 
    And a country of destinantion  using <availableCountry>
    And a travel Mode uisng <travelMode>
    Then the system refuse using <errorMessage>

    Examples: 
      countryDepart | availableCountry  | travelModes | errorMessage
      Greece        | Afghanistan       | airplane    | Unavailble payment method
