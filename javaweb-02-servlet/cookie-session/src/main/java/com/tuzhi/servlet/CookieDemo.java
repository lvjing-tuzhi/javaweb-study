package com.tuzhi.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        if(cookies.length > 2) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("lastTime")) {
                    long l = Long.parseLong(cookie.getValue());
                    Date date = new Date(l);
                    String s = date.toLocaleString();
                    System.out.println("=====");
                    System.out.println(s);
                    System.out.println("=======");
                    writer.write(s);
                }
            }
        }else {
            writer.write("第一次登录");
        }
        Cookie lastTime = new Cookie("lastTime", System.currentTimeMillis() + "");
        resp.addCookie(lastTime);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
