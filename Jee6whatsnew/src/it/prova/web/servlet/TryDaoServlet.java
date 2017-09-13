package it.prova.web.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.dao.StudentDAO;

@WebServlet("/TryDaoServlet")
public class TryDaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	StudentDAO studentDAOInstance;
       
    public TryDaoServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Invocato: TryDaoServlet and..."+studentDAOInstance.list());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
