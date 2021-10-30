package com.tuzhi.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResquestTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("进入验证");
        System.out.println("进入验证");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username: "+username+" password:"+password);
        resp.sendRedirect(req.getContextPath()+"/success.jsp");
    }
}
