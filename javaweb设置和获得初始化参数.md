# javaweb设置和获得初始化参数

## 1.设置参数

在web.xml中

~~~xml
<context-param>
        <param-name>参数名</param-name>
        <param-value>参数值</param-value>
    </context-param>
~~~

## 2.获得参数

~~~java
public class InitParame extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        ServletContext servletContext = this.getServletContext();
//        从web.xml的<context-param>标签中获取
        String name = servletContext.getInitParameter("name");
        resp.getWriter().println("参数："+name);
    }
}
~~~

