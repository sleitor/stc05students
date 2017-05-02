package main.controllers;

import main.services.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Троицкий Дмитрий on 19.04.2017.
 */


public class ListServlet extends HttpServlet {

    @Autowired
    private StudentServiceInterface studentService;
       // new StudentService();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  //      req.setAttribute( "value","Hello, Student!" );


        req.setAttribute( "list", studentService.getAll() );
        getServletContext().getRequestDispatcher( "/listStudents.jsp" ).forward( req,resp );
    }
}
