Feature: New Rx Upload

As a Patient I should be able to upload Rx so that I can view them when I need.

Scenario: Check the browser launch
Given the patient opened "firefox" browser
And enter "http://localhost:8888"
And enter "James" as patient name
And enter  "Kevin" as doctor name
And enter  "10-10-2016"  as visit data
And enter "4:00 pm"  as visit time 
And enter "Basic checkup" as reason
And enter "JamesBasicCheckup.jpg" as uploaded Rx.
When they click "upload"
Then it show "Uploaded successfully" message