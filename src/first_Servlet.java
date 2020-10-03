import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "first_Servlet", urlPatterns = "/first_Servlet") //路径
public class first_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
    // HttpServletRequest HTTP请求的对象 HttpServletResponse HTTP响应的对象
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //  地址栏输入
        //  http://localhost:8080/first_Servlet?name=百度&url=www.baidu.com

        PrintWriter writer = response.getWriter();
        String title = "使用GET方法读取表单数据";

        String name = new String(
                request.getParameter("name")  // .getBytes("ISO-8859-1"),"UTF-8"); 删除此
        );  // 获取name属性的值
        String url = new String(request.getParameter("url"));
        String docType = "<!DOCTYPE htmll> \n";  // HTMl5声明
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>站点名</b>："+ name + "\n" +
                "  <li><b>网址</b>："+ url + "\n" +
                "</ul>\n" +
                "</body></html>"
        );
        writer.println("Hello 1 2 3 4 5 6 7 8 9");
    }
}
