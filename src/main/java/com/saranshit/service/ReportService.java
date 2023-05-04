package com.saranshit.service;

import java.util.List;

import com.saranshit.entity.CitizenPlan;
import com.saranshit.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanName();
	public List<String> getPlanStatus();
	public List<CitizenPlan> search(SearchRequest request);
	public boolean exportExcel();
	public boolean exportPdf();
	
	}
