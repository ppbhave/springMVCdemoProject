package com.springMVCcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springMVModel.StudentModel;

@Controller
public class demoController {
	@RequestMapping("handleForm")
	public ModelAndView handleform(HttpServletRequest req)
	{
		StudentModel st=new StudentModel();
		st.setName(req.getParameter("name"));
		st.setAge(Integer.parseInt(req.getParameter("age")));
		st.setGedre(req.getParameter("gender"));
		ModelAndView mv =new ModelAndView("displayInfo");
		mv.addObject("student", st);
		return mv;
	}
	
	@RequestMapping(value="/")
	public String welcome()
	{
		return "form";

	}

}
