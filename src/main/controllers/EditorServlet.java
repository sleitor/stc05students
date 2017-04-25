package main.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public class EditorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("action", req.getParameter("action"));
        req.getRequestDispatcher( "/edit.jsp" ).forward( req, resp );

    }
}
