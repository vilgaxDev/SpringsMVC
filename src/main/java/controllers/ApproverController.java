package controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.dao.EmployeeDAO;

import models.Leave;

@Controller
public class ApproverController {
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/dashboard")
	public ModelAndView approverDashboard() {
		
		List<Leave> leaves = dao.getAllLeaves();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("approver/dashboard.jsp");
		mv.addObject("leaves", leaves);
		return mv;
		
	}

}
