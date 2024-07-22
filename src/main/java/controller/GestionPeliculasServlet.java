package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GestionPeliculasServlet")
public class GestionPeliculasServlet extends HttpServlet {
    private GestionPeliculasServlet(){}

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
