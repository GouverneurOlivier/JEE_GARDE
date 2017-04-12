package controleurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.beanCpt;
import beans.beanCreation;
import models.modelCreationCpt;

@WebServlet("/controleurCreationCpt")
public class controleurCreationCpt extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public controleurCreationCpt() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/CreationCpt.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		beanCpt cpt=new beanCpt();
		cpt.setFamille(request.getParameter("famille"));
		
		modelCreationCpt modelCpt=new modelCreationCpt();
		modelCpt.creationCptFamille(cpt);
		
		beanCreation Creation =new beanCreation();
		Creation.setNom(request.getParameter("nom"));
		Creation.setPrenom(request.getParameter("prenom"));
		Creation.setEmail(request.getParameter("email"));
		Creation.setCodePostal(request.getParameter("codePostal"));
		
		
		modelCreationCpt modelUser=new modelCreationCpt();
		modelUser.CreationCptUser(Creation,cpt);

		this.getServletContext().getRequestDispatcher("/WEB-INF/Main.jsp").forward(request,response);
	}

}
