Feature: Contact us feature
Scenario Outline: Contact us senario

Given user navigates to contact us page
When user enters all data using sheet name "<Sheetname>" and row number <rownumber>
And user clicks on send button
Then user gets a success message "Your message has been successfully sent to our team."

Examples:
|Sheetname|rownumber|
|Sheet1|0|
|Sheet1|1|