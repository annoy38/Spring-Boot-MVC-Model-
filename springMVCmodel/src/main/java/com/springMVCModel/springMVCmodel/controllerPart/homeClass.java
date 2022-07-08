package com.springMVCModel.springMVCmodel.controllerPart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

import com.springMVCModel.springMVCmodel.patientData.patientDataClass;

@Controller
public class homeClass {
	
	//(If we want to show one data to every page then we will use this approach)
	@ModelAttribute
	public void headerTitle(Model title) {
		title.addAttribute("title", "Popular Diagnostic Center");
	}
	
	@RequestMapping("/")
	public String homePage() {
		return "homepage.html";
	}
	
	// (Without ModelAndView approach)
//	@RequestMapping("/patientdata")
//	public String patientdata(@RequestParam String pName, @RequestParam String pAddress,
//			@RequestParam String pDisease, Model model) {
//		model.addAttribute("pName", pName);
//		model.addAttribute("pAddress", pAddress);
//		model.addAttribute("pDisease", pDisease);
//		return "patientdata.html";
//	}
	
	//(With ModeAndView Approach)
//	@RequestMapping("/patientdata")
//	public ModelAndView patientdata(@RequestParam String pName, @RequestParam String pAddress,
//			@RequestParam String pDisease) {
//		
//		ModelAndView model = new ModelAndView();
//		model.setViewName("patientdata.html");
//		model.addObject("pName", pName);
//		model.addObject("pAddress", pAddress);
//		model.addObject("pDisease", pDisease);
//		return model;
//	}
	
	//(save data as a Object by ModelAttribute)
//	@RequestMapping("/patientdata")
//	public ModelAndView patientdata(@ModelAttribute("patient") patientDataClass patientData) {
//		
//		ModelAndView model = new ModelAndView();
//		model.setViewName("patientdata.html");
//		return model;
//	}
	
	//(Another small approach )
	@RequestMapping("/patientdata")
	public String patientdata(@ModelAttribute("patient") patientDataClass patientData) {
		
		return "patientdata.html";
	}

}
