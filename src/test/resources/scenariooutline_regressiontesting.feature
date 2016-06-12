Feature: New Rx upload

Upload New Rx to and persist

Scenario Outline: Save New Rx
Given <patientName> is uploading Rx with details as doctor <doctorName> gave visit date <pVisitDate> at <pVisitTime> for <checkUpType> and uploaded <fileName> Rx.
When on click of <button>
Then display message <result>

Examples:

|patientName|doctorName|pVisitDate|pVisitTime|checkUpType|fileName|
|"James"|"Kevin"|"12-06-16"|"4:00pm"|"basic checkup"|"JameCheckup.jpg"|
|"James"|"Kevin"|""|"4:00pm"|"basic checkup"|"JameCheckup.jpg"|
|""|"Kevin"|"12-06-16"|"4:00pm"|"basic checkup"|"JameCheckup.jpg"|




