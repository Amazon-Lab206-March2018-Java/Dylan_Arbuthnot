package com.darbuth.countries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.countries.models.City;
import com.darbuth.countries.services.ApiService;

@Controller
public class Countries {
	
	private final ApiService as;
	
	@Autowired
	public Countries(ApiService as) {
		this.as = as;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
//		List<Object[]> table1 = as.countriesSpeakSlovene();
//		System.out.println(table1);
//		for(Object[] row : table1) {
//			String countryName = (String) row[0];
//			String languageName = (String) row[1];
//			double percentage = (double) row[2];
//			System.out.println(countryName + " " + languageName + " " + percentage);
//		}
//		List<Object[]> table2 = as.countryNames();
//		for(Object[] row : table2) {
//			System.out.println(row[0] + " " + row[2]);
//
//		}
//		List<Object[]> table3 = as.mexicoCitiesPopHigherHalfMillion();
//		System.out.println(table3);
//		for(Object[] row : table3) {
//			System.out.println(row[0] + " " + row[1]);
//		}
//		List<Object[]> table4 = as.languagesPercentGreater89();
//		System.out.println(table4);
//		for(Object[] row : table4) {
//			System.out.println(row[0] + " " + row[1] + " " + row[2]);
//		}
//		List<Object[]> table5 = as.countriesSurfaceAreaBelow501PopGreater100000();
//		for(Object[] row : table5) {
//			System.out.println(row[0] + " " + row[1] + " " + row[2]);
//		}
//		List<Object[]> table6 = as.countriesConstitutionalMonarchy();
//		for(Object[] row : table6) {
//			System.out.println(row[0] + " " + row[1] + " " + row[2] + " " + row[3]);
//		}
//		List<Object[]> table7 = as.argentinaCitiesInBuenosAires();
//		for (Object[] row : table7) {
//			System.out.println(row[0] + " " + row[1] + " " + row[2] + " " + row[3]);
//		}
		List<Object[]> table8 = as.summaryCountriesInRegion();
		for (Object[] row : table8) {
			System.out.println(row[0] + " " + row[1]);
		}
		return "index.jsp";
	}
}
