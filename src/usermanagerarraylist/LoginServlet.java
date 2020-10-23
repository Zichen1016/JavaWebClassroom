package usermanagerarraylist;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name = "/LoginServlet",
			urlPatterns = "/usermanagerarraylist/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		ArrayList<String> loginedUserNameList = new ArrayList<>();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * @// TODO: 2020/10/19
		 *接收参数，查询注册用户列表，如果用户存在，将合法用户信息存入已登录列表，
		 *否则返回用户名和密码不正确
		 */
		request.setCharacterEncoding("utf-8"); // 设置接收中文参数值
		String username = request.getParameter("username"); // 获取参数值
		String password = request.getParameter("password");
		ArrayList<User> userlist = (ArrayList<User>) this.getServletContext().getAttribute("userlist");
		boolean loginrecsult = false;
		for (User user: userlist) {
			if(user.getName().equals(username) && 
			   user.getPassword().equals(password)) { // 合法用户
				loginedUserNameList.add(username); // 入已登录用户列表
				loginrecsult = true;
				break;
			}
		}
		this.getServletContext().setAttribute("loginedUserNameList", loginedUserNameList);
		response.setContentType("text/html;charset=utf-8");
		if (loginrecsult) {
			response.getWriter().println("登录成功");
		} else {
			response.getWriter().println("登录失败");
		}

	}
	

}
