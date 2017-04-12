package controleurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import beans.beanLogin;
import models.modelLogin;

@WebServlet("/controleurMain")
public class controleurMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public controleurMain() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		session.invalidate();
		this.getServletContext().getRequestDispatcher("/WEB-INF/Main.jsp").forward(request,response);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		beanLogin login= new beanLogin();
		login.setUser(request.getParameter("username"));
		login.setPassword(request.getParameter("password"));
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
			modelLogin tableLogin = new modelLogin();
			if(tableLogin.testConnection(login))
			{
				session.setAttribute("user",username);
				session.setAttribute("pass", password);
				this.getServletContext().getRequestDispatcher("/WEB-INF/Main2.jsp").forward(request,response);
			}
		
		
	}

}
