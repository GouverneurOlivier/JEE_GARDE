package controleurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.beanModificationCpt;
import models.modelCreationCpt;
import models.modelModificationCpt;

@WebServlet("/controleurModificationCpt")
public class controleurModificationCpt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public controleurModificationCpt() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		beanModificationCpt ModifCpt = new beanModificationCpt();
		ModifCpt=modelModificationCpt.recupererInformation(request.getSession().getAttribute("user").toString());
		
		request.setAttribute("iduser", ModifCpt.getIdUser());
		request.setAttribute("idfamille", ModifCpt.getIdFamille());
		request.setAttribute("nomuser", ModifCpt.getNomUser());
		request.setAttribute("prenomuser", ModifCpt.getPrenomUser());
		request.setAttribute("mailuser", ModifCpt.getMailUser());
		request.setAttribute("usernameuser", ModifCpt.getUserNameUser());
		request.setAttribute("passwordUser", ModifCpt.getPasswordUser());
		request.setAttribute("codepostaluser", ModifCpt.getCodepostalUser());

		this.getServletContext().getRequestDispatcher("/WEB-INF/ModificationCpt.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

	}

}
