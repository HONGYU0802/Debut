package controleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Login;


@WebServlet("/ServletUn")
public class ServletUn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Login log = new Login(request.getParameter("lelogin"), request.getParameter("lepass"));
		//System.out.println("suis arrivee");
		//String log = request.getParameter("lelogin");
		//String pass = request.getParameter("lepass");
		//System.out.println("le login est "+log +" pass "+pass);
		
		//PrintWriter out = response.getWriter();
		//out.println("<html><body>");
		//out.println("bonjour:"+log);
		//out.println("<body></html>");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("lelogin",log);
		//recuperer la session
		//ranger le login en attribut de session
		
		
		if( log.isValide()) {
			// creer une Array
			ArrayList<String> poubelle = new ArrayList<String>();
			session.setAttribute("les taches", poubelle);
			request.getServletContext().getRequestDispatcher("/ok.jsp").forward(request, response);
		}
		request.getServletContext().getRequestDispatcher("/pasOk.jsp").forward(request, response);
	}



}
