
package controllers;

import dao.OratorsDAO;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Orator;

@WebServlet("/registeeOrator")
public class RegisterOrator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtener datos del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String titulo = request.getParameter("titulo");
        String tema = request.getParameter("tema");

        // Crear un objeto Orador con los datos
        Orator orator = new Orator();
        orator.setName(nombre);
        orator.setLastName(apellido);
        orator.setEmail(email);
        orator.setTitle(titulo);
        orator.setTopic(tema);

        // Obtener la fecha actual
        //es una forma de utilizar la clase sin necesitar una declaracion 'import'
        java.util.Date fechaActual = new java.util.Date();
        orator.setSavedDate(fechaActual);

        // Agregar el orador a la base de datos
        OratorsDAO oratorsDAO = new OratorsDAO();
        oratorsDAO.add(orator);

        // Redireccionar a la página de visualización de oradores
        response.sendRedirect(request.getContextPath() + "/views/listOrators.jsp");
    }
}