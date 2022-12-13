Feature: Home Page

Scenario Outline: Create New Work order
When user is on home page
Then click on New work order
And Read the data like <path> and <index> and <RowNum> from excel and fill it
Then click on save

Examples:
|path|index|RowNum|
|"C:\Users\user\Desktop\Data.xlsx"|0|0|
|"C:\Users\user\Desktop\Data.xlsx"|0|1|
|"C:\Users\user\Desktop\Data.xlsx"|0|2|


