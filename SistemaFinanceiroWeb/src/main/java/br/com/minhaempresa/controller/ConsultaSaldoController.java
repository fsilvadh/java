package br.com.minhaempresa.controller;

import br.com.minhaempresa.service.ConsultaSaldoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/consultar-saldo")
public class ConsultaSaldoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));

        ConsultaSaldoService consultarSaldoService = new ConsultaSaldoService();
        double saldo = consultarSaldoService.consultarSaldo(id);

        resp.getWriter().println(saldo);
    }
}
