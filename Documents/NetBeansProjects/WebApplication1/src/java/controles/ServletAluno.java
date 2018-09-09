/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Aluno;
import modelos.ano1;

/**
 *
 * @author Keb Kab
 */
public class ServletAluno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //ISSO É UM TESTE SOMENTE COM O ALUNO DO PRIMEIRO ANO. ADICIONAR OS PROXIMOS NIVEIS
        PrintWriter out = response.getWriter(); Aluno aluno = null;
        if (request.getParameter("rdbTipo").equals("1ano")) aluno = new ano1() {};
        else aluno = null;
        
        aluno.setMatricula(request.getParameter("txtMatricula"));
        aluno.setUser(request.getParameter("txtUser"));
        aluno.setTeste1(Double.parseDouble(request.getParameter("txtNota1")));
        aluno.setTeste2(Double.parseDouble(request.getParameter("txtNota2")));
        aluno.setTeste3(Double.parseDouble(request.getParameter("txtNota3")));
        aluno.setTeste4(Double.parseDouble(request.getParameter("txtNota4")));
        aluno.setProva(Double.parseDouble(request.getParameter("txtProva")));
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Aluno:</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<b>Matricula:</b>" + aluno.getMatricula() + "<br>");
            out.println("<b>User:</b>" + aluno.getUser() + "<br>");
            out.println("<b>Prova 1:</b>" + aluno.getTeste1() + "<br>");
            out.println("<b>Prova 2:</b>" + aluno.getTeste2() + "<br>");
            out.println("<b>Prova 3:</b>" + aluno.getTeste3() + "<br>");
            out.println("<b>Prova 4:</b>" + aluno.getTeste4() + "<br>");
            out.println("<b>Média:</b>" + aluno.getMedia() + "<br>");
            out.println("<b>Prova Final:</b>" + aluno.getProva() + "<br>");
            out.println("</body>");
            out.println("</html>");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
