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
Feature: US_001 Display Travel Modes

As a User, 
I would like to see all the travel modes available for each country depending on my current country. 

  @tag1
  Scenario: Display all the travel modes for a specific country 
    Given a user iinitial country of desparture using <countryDepart> 
    And all the countries available  using <availableCountry>
    When a user choose a country
    Then display all the travel modes avalaible for each country uisng <travelModes>
    And order by alphabetic order
    
   Examples: 
   
     countryDepart | availableCountry  | travelModes 
     Greece        | Afghanistan       | airplane   
     Greece        | Albania           | airplane  
     Greece        | Algeria           | airplane, bus

  @tag2
  Scenario Outline: refuse of an avialble country 
    Given a user iinitial country of desparture using <countryDepart> 
    And all the countries available  using <availableCountry>
    When a user choose a country that is not covered by the travel agency
    Then system refuse using <errorMessage> 
    And an alternative destination using <alternantiveMessage>
    

    Examples: 
       countryDepart | availableCountry  | errorMessage                       | alternativeMessage       
       Greece        | United States     | unavailable country of destination | choose another country available  
     
