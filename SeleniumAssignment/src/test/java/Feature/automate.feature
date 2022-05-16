Feature: Automate end to end Buy Order functionality

  Background: Login to the website
    Given User clicks the website
    When User clicks signin button
    And User enters email and password under Already Registered.
    Then User clicks the signin button
    
   
  Scenario Outline: Order Tshirt
    Given User enters their account
    When User moves cursor over Women's link
    And User clicks on T-shirts
    And User hovers mouse on second product
    And User clicks on More button
    And User clicks the Increase quantity button to 2
    And User Selects size as L
    And User selects the color
    And User clicks the Add to cart button
    Then User clicks the proceed to checkout button
     
    
