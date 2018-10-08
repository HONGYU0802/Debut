package controleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletAjoute")
public class ServletAjoute extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recupere le paramettre tache de la jsp
		String t = request.getParameter("latache");
		
		//recuperer la poubelle sur la session
		HttpSession session = request.getSession();

		ArrayList<String> poubelle = (ArrayList<String>) session.getAttribute("les taches");
		
		//ajouter la tache a poubelle
		poubelle.add(t);
		//forword vers ok.jsp
		request.getServletContext().getRequestDispatcher("/ok.jsp").forward(request, response);
	}

}
