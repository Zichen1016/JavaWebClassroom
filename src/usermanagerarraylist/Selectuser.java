package usermanagerarraylist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Selectuser",
            urlPatterns = "/usermanagerarraylist/selectuser")
public class Selectuser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        ArrayList<String> loginedUserNameList = (ArrayList<String>) this.getServletContext().getAttribute("loginedUserNameList");
        for (String name: loginedUserNameList) {
            if (username.equals(name)){
                ArrayList<User> userlist = (ArrayList<User>) this.getServletContext().getAttribute("userlist");
                for (User user: userlist) {
                    if (user.getName().equals(username)) {
                        response.setContentType("text/html;charset=utf-8");
                        response.getWriter().println("用户名：" + user.getName() + "密码：" + user.getPassword());
                        return;
                    }
                }
            }
        }
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("未登录或者用户不存在");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
