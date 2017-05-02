package main.controllers;

import main.services.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by User on 27.04.2017.
 */
@Controller
@RequestMapping(value = "/listStudents")
public class ListController {



    @Autowired
    private StudentServiceInterface studentService;

    @RequestMapping(method = RequestMethod.GET)
    public String showList(Model model){

        model.addAttribute("list", studentService.getAll());
        return "listStudents";
    }
}

