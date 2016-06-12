package test.testcase.rx;

import junit.framework.TestCase;

import org.junit.Test;

import com.doc.track.PatientInfo;
import com.doc.track.PatientInfoAction;

public class PatientIntfoActionTestcases extends TestCase
{
	
	@Test
	public void testsaveNewRxSuccess()
	{
		PatientInfo patient = new PatientInfo();
		patient.setPatientName("James");
		patient.setDoctorName("Kevin");
		patient.setFileName("x.jpg");
		patient.setReason("Nomral check");
		patient.setVisitDate("10-10-2016");
		patient.setVisitTime("11:00 am");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Valid info",result);
	}
	@Test
	public void testEmptyPatientName()
	{
		PatientInfo patient = new PatientInfo();
		patient.setPatientName("");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Invalid Patient Name",result);
	}
	@Test
	public void testPatientNameForNumerics()
	{
		PatientInfo patient = new PatientInfo();
		patient.setPatientName("123456");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Invalid Patient Name",result);
	}
	
	@Test
	public void testPatientNameForSplChar()
	{
		PatientInfo patient = new PatientInfo();
		patient.setPatientName("!@#$%^&*()");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Invalid Patient Name",result);
		
	}

	@Test
	public void testEmptyDoctorName()
	{
		PatientInfo patient = new PatientInfo();
		patient.setDoctorName("");
		patient.setPatientName("James");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Invalid Doctor Name",result);
	}
	
	public void testDoctorNameForNumerics()
	{
		PatientInfo patient = new PatientInfo();
		patient.setDoctorName("1234567890");
		patient.setPatientName("James");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Invalid Doctor Name",result);
	}
	
	public void testDoctorNameForSplChar()
	{
		PatientInfo patient = new PatientInfo();
		patient.setDoctorName("!@#$^&*()");
		patient.setPatientName("James");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Invalid Doctor Name",result);
	}
	
	public void testEmptyVisitDate()
	{
		PatientInfo patient = new PatientInfo();
		patient.setDoctorName("Kevin");
		patient.setPatientName("James");
		patient.setVisitDate("");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Invalid Date Format",result);
	}
	
	public void testEmptyVisitTime()
	{
		PatientInfo patient = new PatientInfo();
		patient.setDoctorName("Kevin");
		patient.setPatientName("James");
		patient.setVisitDate("10-06-2016");
		patient.setVisitTime("");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Invalid Time Format",result);
	}
	
	public void testEmptyReason()
	{
		PatientInfo patient = new PatientInfo();
		patient.setDoctorName("Kevin");
		patient.setPatientName("James");
		patient.setVisitDate("10-06-2016");
		patient.setVisitTime("4:00pm");
		patient.setReason("");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Reason is Mandatory",result);
	}
	
	public void testEmptyFileName()
	{
		PatientInfo patient = new PatientInfo();
		patient.setDoctorName("Kevin");
		patient.setPatientName("James");
		patient.setVisitDate("10-06-2016");
		patient.setVisitTime("4:00pm");
		patient.setReason("Basic Checkup");
		patient.setFileName("");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Please Enter file name",result);
	}
	
	public void testInvalidFileNameFormat()
	{
		PatientInfo patient = new PatientInfo();
		patient.setDoctorName("Kevin");
		patient.setPatientName("James");
		patient.setVisitDate("10-06-2016");
		patient.setVisitTime("4:00pm");
		patient.setReason("Basic Checkup");
		patient.setFileName("test.gif");
		String result = new PatientInfoAction().validateRxInfo(patient);
		assertEquals("Please Upload file with .jpg or .png or .pdf",result);
	}
	
	
	
	
}
