package main.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import main.services.UserServiceInterface;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Троицкий Дмитрий on 19.04.2017.
 */
public class LoginServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger( LoginServlet.class );

    @Autowired
    private UserServiceInterface userService;
    //   =  new UserService();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());
     }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher( "/login.jsp" )
                .forward( req,resp );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter( "password" );

        if (userService.auth(login,password) != null){
            req.getSession().setAttribute( "userLogin",login );

            resp.sendRedirect( req.getContextPath()+"/listStudents" );

        } else {
            resp.sendRedirect(req.getContextPath());
        }
    }

}
