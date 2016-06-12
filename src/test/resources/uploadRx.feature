Feature: New Rx Upload

As a Patient I should be able to upload Rx so that I can view them when I need.

Scenario: Valid data Form
Given "James" is uploading Rx with details as doctor "Kevin" gave visit date "10-10-2016" at "4:00 pm" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx uploaded successfully"

Scenario: Invalid data Form
Given "" is uploading Rx with details as doctor "Kevin" gave visit date "10-10-2016" at "4:00 pm" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid Patient Name"

Scenario: Invalid data Form
Given "James" is uploading Rx with details as doctor "" gave visit date "10-10-2016" at "4:00 pm" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid Doctor Name"

Scenario: Invalid data Form
Given "James" is uploading Rx with details as doctor "Kevin" gave visit date "" at "4:00 pm" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid date"

Scenario: Invalid data Form
Given "James" is uploading Rx with details as doctor "Kevin" gave visit date "10-10-2016" at "" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid time"

Scenario: Invalid data Form
Given "James" is uploading Rx with details as doctor "Kevin" gave visit date "10-10-2016" at "4:00 pm" for "" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid reason"

Scenario: Invalid data Form
Given "James" is uploading Rx with details as doctor "Kevin" gave visit date "10-10-2016" at "4:00 pm" for "Basic checkup" and uploaded "test.pdf" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid fileType"

Scenario: Invalid data Form
Given "678  12" is uploading Rx with details as doctor "Kevin" gave visit date "10-10-2016" at "4:00 pm" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid Patient Name"

Scenario: Invalid data Form
Given ")(*&^%$#@" is uploading Rx with details as doctor "Kevin" gave visit date "10-10-2016" at "4:00 pm" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid Patient Name"

Scenario: Invalid data Form
Given "James" is uploading Rx with details as doctor "2342 234" gave visit date "10-10-2016" at "4:00 pm" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid Doctor Name"

Scenario: Invalid data Form
Given  "James" is uploading Rx with details as doctor "$%^&*" gave visit date "10-10-2016" at "4:00 pm" for "Basic checkup" and uploaded "JamesBasicCheckup.jpg" Rx.
When on click of "submit"
Then display message "Rx not uploaded Invalid Doctor Name"





