package main.controllers;

import main.services.StudentServiceInterface;
import main.services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by User on 27.04.2017.
 */

@Controller

@RequestMapping(value = "/edit")
public class EditController {

    private final StudentServiceInterface studentService;

    @Autowired
    public EditController(StudentServiceInterface studentService) {
        this.studentService = studentService;
    }


    @RequestMapping(method = RequestMethod.GET)
    private ModelAndView getStudentForEditById(@RequestParam(value = "id", required= false) Long id,
                                               @RequestParam(value = "action", required= false) String action){

        ModelAndView mav = new ModelAndView();

        if ("delete".equals(action)) {

            if (id != null) {
                studentService.delete(id);
            }
        };

        if (id != null) {
            mav.getModelMap().addAttribute("user", studentService.read(id));
        }

        mav.getModelMap().addAttribute("action", action);

        mav.setViewName("edit");

    return mav;
    }

 }
