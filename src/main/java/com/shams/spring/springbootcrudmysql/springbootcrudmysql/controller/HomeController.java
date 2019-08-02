package com.shams.spring.springbootcrudmysql.springbootcrudmysql.controller;

import com.shams.spring.springbootcrudmysql.springbootcrudmysql.model.Student;
import com.shams.spring.springbootcrudmysql.springbootcrudmysql.service.AddressService;
import com.shams.spring.springbootcrudmysql.springbootcrudmysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private AddressService addressService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/students")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("students", studentService.getAll());
        return modelAndView;
    }

    @GetMapping("create")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("create", "student", new Student());
        return modelAndView;
    }

    @PostMapping("create")
    public String create(@ModelAttribute("student") Student student) {
        studentService.save(student);
        return "redirect:/students";
    }
}
