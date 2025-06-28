package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.DAO; // IMPORTANTO CLASSE DAO PARA EXECUTAR O TESTE DE CONEXAO.

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = {"/Controller", "/main"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// INSTANCIANDO E CRIANDO UM OBJETO PARA REALIZAR O TESTE DE CONEXÃO:
	/* DAO conexaoDAO = new DAO(); */  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// TESTANDO A CONEXÃO COM O DAO:
			/* conexaoDAO.testeConexao(); */
	}

}
