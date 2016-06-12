package com.doc.track;


import java.util.regex.*;

public class PatientInfoAction
{
	public String uploadRx(PatientInfo patient)
	{
		try
		{
			String patientName = patient.getPatientName();	
			String doctorName = patient.getDoctorName();
			String visitDate = patient.getVisitDate();
			String visitTime = patient.getVisitTime();
			String reason = patient.getReason();
			String fileName = patient.getFileName();
			
			
			if(patientName.isEmpty())
			{
				return "Rx not uploaded Invalid Patient Name";
			}
			if(doctorName.isEmpty())
			{
				return "Rx not uploaded Invalid Doctor Name";
			}
			if(visitDate.isEmpty())
			{
				return "Rx not uploaded Invalid date";
			}
			if(visitTime.isEmpty())
			{
				return "Rx not uploaded Invalid time";
			}
			if(reason.isEmpty())
			{
				return "Rx not uploaded Invalid reason";
			}
			if(fileName.isEmpty())
			{
				return "Rx not uploaded Invalid fileType";
			}
			
			if(patientName.matches("[0-9 ]+"))
			{
				return "Rx not uploaded Invalid Patient Name";
			}
			if(patientName.matches("[~!@#$%^&*() ]+"))
			{
				return "Rx not uploaded Invalid Patient Name";
			}
			if(doctorName.matches("[0-9 ]+"))
			{
				return "Rx not uploaded Invalid Doctor Name";
			}
			if(doctorName.matches("[~!@#$%^&*() ]+"))
			{
				return "Rx not uploaded Invalid Doctor Name";
			}
			if(fileName.indexOf(".pdf")!=-1)
			{
				return "Rx not uploaded Invalid fileType";
			}
			if(!patientName.isEmpty())
			{
				return "Rx uploaded successfully";
			}
		}
		catch(Exception e)
		{
			
		}
		return "Rx uploaded successfully";
	}
	public String validateRxInfo(PatientInfo patient) {
		if(patient.getPatientName().isEmpty() || patient.getPatientName().matches("[0-9 ]+") || patient.getPatientName().matches("[~!@#$%^&*() ]+")) 
		{
			return "Invalid Patient Name";
		}
		if(patient.getDoctorName().isEmpty() || patient.getDoctorName().matches("[0-9 ]+") || patient.getDoctorName().matches("[~!@#$%^&*() ]+")) 
		{
			return "Invalid Doctor Name";
		}
		if(patient.getVisitDate().isEmpty()) 
		{
			return "Invalid Date Format";
		}
		if(patient.getVisitTime().isEmpty()) 
		{
			return "Invalid Time Format";
		}
		if(patient.getReason().isEmpty()) 
		{
			return "Reason is Mandatory";
		}
		if(patient.getFileName().isEmpty()) 
		{
			return "Please Enter file name";
		}
		if(patient.getFileName().indexOf(".gif") > 1)
		{
			return "Please Upload file with .jpg or .png or .pdf";
		}
		
		return "Valid info";
		
	
	}

}
