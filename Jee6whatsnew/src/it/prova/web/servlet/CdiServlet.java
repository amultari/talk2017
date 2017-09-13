package it.prova.web.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.service.MyService;

@WebServlet("/CdiServlet")
public class CdiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// la DI è una specifica!! no get no set!! però non basta Tomcat (servlet 3.1
	// almeno)
	@Inject
	MyService myServiceInstance;

	public CdiServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Hai invocato: CdiServlet ").append("\n"+myServiceInstance.sayHello());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
