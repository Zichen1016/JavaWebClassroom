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
@WebServlet(name = "/RegisterServlet",
			urlPatterns = "/usermanagerarraylist/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		ArrayList<User> userlist = new ArrayList<>(); // 注册list只new一次 或者在init初始化中new注册用户列表
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8"); // 设置接收中文参数值
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);
		userlist.add(user);
		this.getServletContext().setAttribute("userlist", userlist);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("注册成功");
	}



}
