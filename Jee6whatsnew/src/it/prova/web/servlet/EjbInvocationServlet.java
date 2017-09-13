package it.prova.web.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.ejb.HelloEnterprise;

@WebServlet("/EjbInvocationServlet")
public class EjbInvocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	HelloEnterprise helloEnterpriseBean;
       
    public EjbInvocationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: EjbInvocationServlet, "+helloEnterpriseBean.helloEJB());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
