import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(
        name = "ServerConfigServlet",  // 指定servlet的name属性,若没有指定，则默认是类的全限类名
        urlPatterns = "/ServerConfigServlet",  // 指定一组servlet的url的匹配模式，等价于<url-pattern>
        loadOnStartup = 1,  // 指定servlet的加载顺序，等价于<load-on-startup>
        initParams = {  // 指定一组初始化参数，等价于<>
                @WebInitParam(name = "username", value = "张三 "),
                @WebInitParam(name = "encoding",value = "UTR-8")
        }
)

public class ServerConfigServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = this.getServletConfig();
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);
        String encoding = servletConfig.getInitParameter("encoding");
        System.out.println(encoding);
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            System.out.println(initParameterNames.nextElement());
        }
    }
}
