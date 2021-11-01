package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

/**
 * Servlet implementation class RemoverEmpresaServlet
 */
@WebServlet("/removerEmpresaServlet")
public class RemoverEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empresaID = request.getParameter("id");
		
		System.out.println("Caiu no RemoverEmpresaServlet empresa ID: " + empresaID);
		
		Banco banco = new Banco();
		banco.removerEmpresa(empresaID);
		
		response.sendRedirect("listaEmpresas");
	}

}
