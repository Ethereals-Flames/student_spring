package std.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import std.dao.StudentDaoImpl;
import std.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDaoImpl stddao;

	@RequestMapping(value= {"/"})
	public String insert() {
		return "insertStudent";		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student,
			BindingResult result) {
		
		stddao.saveStudent(student);
		
		return "successPage";
		
	}
}
