package com.tuzhi.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlinePeople implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        Integer onlinePeople = (Integer) servletContext.getAttribute("onlinePeople");
        if (onlinePeople == null) {
            onlinePeople = 1;
        }else {
            onlinePeople++;
        }
        servletContext.setAttribute("onlinePeople",onlinePeople);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        Integer onlinePeople = (Integer) servletContext.getAttribute("onlinePeople");
        if (onlinePeople == null) {
            onlinePeople = 0;
        }else {
            onlinePeople--;
        }
        servletContext.setAttribute("onlinePeople",onlinePeople);
    }
}
