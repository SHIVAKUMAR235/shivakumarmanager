Feature: flipkart login and logout

Scenario: flipkart 
Given open browser "Chrome"
When launch site "https://www.flipkart.com"
Then homepage should be displayed
When click on login button
Then login window should be displayed
And click on logout
Then login page should redisplyed