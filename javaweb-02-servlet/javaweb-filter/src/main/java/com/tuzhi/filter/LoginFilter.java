package com.tuzhi.filter;

import com.tuzhi.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String path = request.getContextPath();
        if (request.getSession().getAttribute(Constant.USER_SESSION) == null) {
            response.sendRedirect(path + "/error.jsp");
        }
        filterChain.doFilter(req,resp);
    }

    @Override
    public void destroy() {

    }
}
