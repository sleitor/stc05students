package main.controllers;

import main.model.pojo.User;
import main.services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by User on 27.04.2017.
 */
@Controller
@SessionAttributes("login")
public class HelloController {

    private final UserServiceInterface userService;

    @Autowired
    public HelloController(UserServiceInterface userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello (){
        return "redirect:listStudents";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView login (@RequestParam(value = "login", required = true) String login,
                               @RequestParam(value = "password") String password) {

        ModelAndView mav = new ModelAndView();
//        mav.setViewName("listStudents");

//        User user = null;
//        if (userService.auth(login,password) != null){
//
            mav.setViewName("redirect:listStudents");

//        } else {
//            resp.sendRedirect(req.getContextPath());
//        }
//


        return mav;
    }
}
