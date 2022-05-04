Feature: flipkart login and logout

Scenario: flipkart 
Given open browser "Chrome"
When launch site "https://www.flipkart.com"
When click on login button and use this ud "9492150714" and pw "9492150714"
Then homepage should be displayed
And click on logout
Then close browser