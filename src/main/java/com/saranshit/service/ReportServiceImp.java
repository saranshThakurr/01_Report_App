package com.saranshit.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.saranshit.entity.CitizenPlan;
import com.saranshit.repo.CitizenPlanRepository;
import com.saranshit.request.SearchRequest;

@Service
public class ReportServiceImp implements ReportService {

	@Autowired
	private CitizenPlanRepository planRepo;

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
//		if (null != request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
//			entity.setPlanStatus(request.getPlanStatus());
//		}
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
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
