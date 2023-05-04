package com.saranshit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.saranshit.entity.CitizenPlan;
import com.saranshit.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		repo.deleteAll();

		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Yash");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5600.20);

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Ayush");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Property reason");

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Ritik");
		c3.setGender("Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(3600.02);
		c3.setTerminationDate(LocalDate.now());
		c3.setTerminationReason("Employed");

		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("kashish");
		c4.setGender("Female");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(6600.28);

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Ayushi");
		c5.setGender("Female");
		c5.setPlanName("Cash");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("family reason");

		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Ritikia");
		c6.setGender("Female");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(5));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(4610.50);
		c6.setTerminationDate(LocalDate.now());
		c6.setTerminationReason("Salary");

//        2nd
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Vishwash");
		c7.setGender("Male");
		c7.setPlanName("Food");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(7600.50);

		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Sai");
		c8.setGender("Male");
		c8.setPlanName("Food");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Cash reason");

		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Amar");
		c9.setGender("Male");
		c9.setPlanName("Food");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(5));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(5700.02);
		c9.setTerminationDate(LocalDate.now());
		c9.setTerminationReason("Cash");

		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Saloni");
		c10.setGender("Female");
		c10.setPlanName("Food");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(6800.28);

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Rani");
		c11.setGender("Female");
		c11.setPlanName("Food");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("other reason");

		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Ritikia");
		c12.setGender("Female");
		c12.setPlanName("Food");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(5));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmt(5610.50);
		c12.setTerminationDate(LocalDate.now());
		c12.setTerminationReason("Employed");

//		 3rd
		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizenName("Karthik");
		c13.setGender("Male");
		c13.setPlanName("Medical");
		c13.setPlanStatus("Approved");
		c13.setPlanStartDate(LocalDate.now());
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenefitAmt(5300.50);

		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizenName("AmarSai");
		c14.setGender("Male");
		c14.setPlanName("Medical");
		c14.setPlanStatus("Denied");
		c14.setDenialReason("Property reason");

		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizenName("Amrish");
		c15.setGender("Male");
		c15.setPlanName("Medical");
		c15.setPlanStatus("Terminated");
		c15.setPlanStartDate(LocalDate.now().minusMonths(2));
		c15.setPlanEndDate(LocalDate.now().plusMonths(6));
		c15.setBenefitAmt(5600.02);
		c15.setTerminationDate(LocalDate.now());
		c15.setTerminationReason("Money Problam");

		CitizenPlan c16 = new CitizenPlan();
		c16.setCitizenName("Mohini");
		c16.setGender("Female");
		c16.setPlanName("Medical");
		c16.setPlanStatus("Approved");
		c16.setPlanStartDate(LocalDate.now());
		c16.setPlanEndDate(LocalDate.now().plusMonths(6));
		c16.setBenefitAmt(5100.28);

		CitizenPlan c17 = new CitizenPlan();
		c17.setCitizenName("loficia");
		c17.setGender("Female");
		c17.setPlanName("Medical");
		c17.setPlanStatus("Denied");
		c17.setDenialReason("Family reason");

		CitizenPlan c18 = new CitizenPlan();
		c18.setCitizenName("Subhishi");
		c18.setGender("Female");
		c18.setPlanName("Medical");
		c18.setPlanStatus("Terminated");
		c18.setPlanStartDate(LocalDate.now().minusMonths(3));
		c18.setPlanEndDate(LocalDate.now().plusMonths(6));
		c18.setBenefitAmt(3610.50);
		c18.setTerminationDate(LocalDate.now());
		c18.setTerminationReason("Employed");

		// 4th
		CitizenPlan c19 = new CitizenPlan();
		c19.setCitizenName("Aryan");
		c19.setGender("Male");
		c19.setPlanName("Employment");
		c19.setPlanStatus("Approved");
		c19.setPlanStartDate(LocalDate.now());
		c19.setPlanEndDate(LocalDate.now().plusMonths(6));
		c19.setBenefitAmt(6100.50);

		CitizenPlan c20 = new CitizenPlan();
		c20.setCitizenName("Monty");
		c20.setGender("Male");
		c20.setPlanName("Employment");
		c20.setPlanStatus("Denied");
		c20.setDenialReason("Broker reason");

		CitizenPlan c21 = new CitizenPlan();
		c21.setCitizenName("Jay");
		c21.setGender("Male");
		c21.setPlanName("Employment");
		c21.setPlanStatus("Terminated");
		c21.setPlanStartDate(LocalDate.now().minusMonths(1));
		c21.setPlanEndDate(LocalDate.now().plusMonths(6));
		c21.setBenefitAmt(1600.02);
		c21.setTerminationDate(LocalDate.now());
		c21.setTerminationReason("Enjoy");

		CitizenPlan c22 = new CitizenPlan();
		c22.setCitizenName("Aishwarya");
		c22.setGender("Female");
		c22.setPlanName("Employment");
		c22.setPlanStatus("Approved");
		c22.setPlanStartDate(LocalDate.now());
		c22.setPlanEndDate(LocalDate.now().plusMonths(6));
		c22.setBenefitAmt(7100.28);

		CitizenPlan c23 = new CitizenPlan();
		c23.setCitizenName("Shuchi");
		c23.setGender("Female");
		c23.setPlanName("Employment");
		c23.setPlanStatus("Denied");
		c23.setDenialReason("Employed");

		CitizenPlan c24 = new CitizenPlan();
		c24.setCitizenName("Sonamiya");
		c24.setGender("Female");
		c24.setPlanName("Medical");
		c24.setPlanStatus("Terminated");
		c24.setPlanStartDate(LocalDate.now().minusMonths(4));
		c24.setPlanEndDate(LocalDate.now().plusMonths(6));
		c24.setBenefitAmt(4810.50);
		c24.setTerminationDate(LocalDate.now());
		c24.setTerminationReason("Marriage");

		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16,
				c17, c18, c19, c20, c21, c22, c23, c24);
//		repo.saveAll(list);
	}
}
