package com.saranshit.service;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.saranshit.entity.CitizenPlan;
import com.saranshit.repo.CitizenPlanRepository;
import com.saranshit.request.SearchRequest;
import com.saranshit.utils.EmailSender;
import com.saranshit.utils.ExcelGenerator;
import com.saranshit.utils.PdfGenerator;

@Service
public class ReportServiceImp implements ReportService {

	@Autowired
	private CitizenPlanRepository planRepo;
	
	@Autowired
	private ExcelGenerator excelGenerator;
	
	@Autowired
	private PdfGenerator pdfGenerator;
	
	@Autowired
	private EmailSender emailsender;
	


	@Override
	public List<String> getPlanName() {
		return planRepo.getPlanName();
	}

	@Override
	public List<String> getPlanStatus() {
		return planRepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {

		CitizenPlan entity = new CitizenPlan();

		if (null != request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
		if (null != request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		}
		if (null != request.getGender() && !"".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}
		if (null != request.getPlanStartDate() && !"".equals(request.getPlanStartDate())) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String date = request.getPlanStartDate();

			// convert String to LocalDate
			LocalDate localDate = LocalDate.parse(date, formatter);
			entity.setPlanStartDate(localDate);
		}
		if (null != request.getPlanEndDate() && !"".equals(request.getPlanEndDate())) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String date = request.getPlanEndDate();

			// convert String to LocalDate
			LocalDate localDate = LocalDate.parse(date, formatter);
			entity.setPlanEndDate(localDate);
		}
		
		return planRepo.findAll(Example.of(entity));
		//System.out.println(findAll);
		//return findAll;
	}

	@Override
	public boolean exportExcel(HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("plans.xls");
		List<CitizenPlan> findAll = planRepo.findAll();
		excelGenerator.generateExcel(response, findAll,f);
		String to="saransh11111@gmail.com";
		String subject="Test Mail subject";
		String body="<h1>test mail body</h2>";
		emailsender.sendEmail(to, body, subject,f);
		f.delete();
		return true;
		
	}

	@Override
	public boolean exportPdf(HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("plans.pdf");
		List<CitizenPlan> findAll = planRepo.findAll();
		pdfGenerator.pdfGerator(response, findAll,f);
		String to="saransh11111@gmail.com";
		String subject="Test Mail subject";
		String body="<h1>test mail body</h2>";
		emailsender.sendEmail(to, body, subject,f);
		f.delete();
		return true;
	}

}
