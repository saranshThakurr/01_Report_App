package com.saranshit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.saranshit.entity.CitizenPlan;
import com.saranshit.request.SearchRequest;
import com.saranshit.service.ReportService;

@Controller
public class ReportController {
 
	@Autowired
	private ReportService service;
	
	
	@PostMapping("/search")
    public String handleSearch(@ModelAttribute("search")  SearchRequest search , Model model) {

        List<CitizenPlan> plans = service.search(search);
        model.addAttribute("plans", plans);
        init(model);

        return "home";
    }

	
	@GetMapping("/")
	public String getIndex(Model model) {
		SearchRequest searchObj=new SearchRequest();
		model.addAttribute("search", searchObj);
		init(model);
		return "home";
	}

	private void init(Model model) {
		
		model.addAttribute("name", service.getPlanName());
		model.addAttribute("status", service.getPlanStatus());
	}
}
