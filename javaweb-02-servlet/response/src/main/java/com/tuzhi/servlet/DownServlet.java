package com.tuzhi.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class DownServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        文件下载路径
        String realPath = "D:\\Java\\javaweb-02-servlet\\response\\src\\main\\resources\\1.png";
        System.out.println("下载的路径：" + realPath);
//        获取路径名
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
//        设置头部进行下载
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"UTF-8"));
//        获得输入流
        FileInputStream in = new FileInputStream(realPath);
//        缓存区
        int len = 0;
        byte[] buffer = new byte[1024];
        ServletOutputStream out = resp.getOutputStream();
        while ((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
        in.close();
        out.close();
    }
}
