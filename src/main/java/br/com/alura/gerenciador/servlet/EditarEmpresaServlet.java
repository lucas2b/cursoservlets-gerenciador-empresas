package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

@WebServlet("/editarEmpresa")
public class EditarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeEmpresa = request.getParameter("nome");
		Integer id = Integer.parseInt(request.getParameter("id"));
		Date dataFormatada = null;
		
		try {
			String dataCriacaoString = request.getParameter("data");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataFormatada = sdf.parse(dataCriacaoString);
		}catch(ParseException e) {
			throw new ServletException(e); //catch and rethrow
		}
		
		Banco banco = new Banco();
		banco.editarEmpresa(id, nomeEmpresa, dataFormatada);
		
		response.sendRedirect("listaEmpresas");
		
	}

}
