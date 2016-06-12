package com.doc.track;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PatientDocTrack_CSDServlet extends HttpServlet {
	PatientInfo patient = new PatientInfo();
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		String patientName,doctorName,visitDate,visitTime,reason,fileName,fileUploadedURL;
		patientName = req.getParameter("pname");
		doctorName = req.getParameter("dname");
		visitDate = req.getParameter("vdate");
		visitTime = req.getParameter("vtime");
		reason = req.getParameter("reason");
		fileName = req.getParameter("fileName");

		patient.setPatientName(patientName);
		patient.setDoctorName(doctorName);
		patient.setVisitDate(visitDate);
		patient.setVisitTime(visitTime);
		patient.setReason(reason);
		patient.setFileName(fileName);
		new PatientInfoAction().uploadRx(patient);
		
	}
}
