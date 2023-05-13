package com.saranshit.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.saranshit.entity.CitizenPlan;

@Component
public class PdfGenerator {

	public void pdfGerator(HttpServletResponse response,List<CitizenPlan> findAll,File file) throws Exception{
		Document document =new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());
		PdfWriter.getInstance(document, new FileOutputStream(file));
		document.open();
		
		Paragraph p=new Paragraph("Citizen Plan Info");
		p.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(p);
		
		PdfPTable table=new PdfPTable(6);
		
		table.addCell("Id");
		table.addCell("Citizen name");
		table.addCell("Plan name");
		table.addCell("Plan status");
		table.addCell("Start date");
		table.addCell("End date");

		for(CitizenPlan plan:findAll) {
			table.addCell(String.valueOf( plan.getCitizenId()));
			table.addCell(plan.getCitizenName());
			table.addCell(plan.getPlanName());
			table.addCell(plan.getPlanStatus());
			if(plan.getPlanStartDate()!=null) {
			table.addCell(plan.getPlanStartDate()+"");
			}else {
				table.addCell("N/A");
			}
			if(plan.getPlanEndDate()!=null) {
				table.addCell(plan.getPlanStartDate()+"");
			}else {
				table.addCell("N/A");
			}
			
		}
		document.add(table);
		document.close();
	}
}
