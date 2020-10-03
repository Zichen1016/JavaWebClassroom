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
        name = "test_Servlet",
        urlPatterns = "/test_Servlet",
        loadOnStartup = 2,
        initParams = {
                @WebInitParam(name = "username",value = "李四"),
                @WebInitParam(name = "encoding2",value = "UTF-8")
        }
)
public class test_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("2.get请求");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("1.初始化");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("3.退出");
    }
}
