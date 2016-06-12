package test.java;

import junit.framework.TestCase;

import com.doc.track.PatientInfo;
import com.doc.track.PatientInfoAction;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	PatientInfo patient = new PatientInfo();
	String actionButton;
	@Given("^\"([^\"]*)\" is uploading Rx with details as doctor \"([^\"]*)\" gave visit date \"([^\"]*)\" at \"([^\"]*)\" for \"([^\"]*)\" and uploaded \"([^\"]*)\" Rx.$")
	public void upload_Rx(String patientName, String doctorName, String visitDate, String visitTime, String reason, String fileName) throws Throwable {
		
		
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		patient.setPatientName(patientName);
		patient.setDoctorName(doctorName);
		patient.setVisitDate(visitDate);
		patient.setVisitTime(visitTime);
		patient.setReason(reason);
		patient.setFileName(fileName);
	}

	@When("^on click of \"([^\"]*)\"$")
	public void on_click_of(String action) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		actionButton = action;
		
	}

	@Then("^display message \"([^\"]*)\"$")
	public void display_message(String result) throws Throwable {
		
		PatientInfoAction uploadAction = new PatientInfoAction();
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		if(actionButton.equals("submit"))
		{
			assertEquals(result, uploadAction.uploadRx(patient));	
		}
		else if(actionButton.equals("reset"))
		{
			
		}
		
	}

	}

