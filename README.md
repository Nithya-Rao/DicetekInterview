# DicetekAssignment



The approach I used here:
Firstly I'm creating a Maven project and I'm passing Maven Dependencies, TestNG Dependencies and Selenium Dependencies in My POM.XML

In src/main/java - I created a BaseTest to initiate and teardown the driver (setup() and teardown()). Unfortunately not extending the BaseTest class as the URL is changing and appending the URL is not considered here.

In src/test/java - I have created a SubscriptionTest class and have called a method each for 3 different countries

Since I'm using TestNG for annotations and Assertions for validating, I converted my entire project to TestNG Suite

I've also added a config.properties file in my src/main/resources where I can call the url https://subscribe.stctv.com

NOTE: Few points to higlight
- After launching https://subscribe.stctv.com - Since there is no KSA, Kuwait and Bahrain in the countries displayed, I'm not using config.properties

- As the URL is changing country wise, I have called driver.get() separately inside all the methods

- I can create a Excel sheet for all my Expected results in a excel file which can be stored under src/test/resources. But due to time-constraint I've hardcoded the Expected Value :-(

Finally, Run SusciptionTest.java as TestNG suite and all the 3 test methods are passed.

