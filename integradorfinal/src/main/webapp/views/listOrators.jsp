<%-- 
    Document   : listOrators
    Created on : 22 dic 2023, 17:56:01
    Author     : Dialer
--%>


<%@page import="dao.OratorsDAO"%>
<%@page import="java.util.List"%>
<%@page import="models.Orator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta charset="UTF-8">
        <title>Lista de Oradores</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-5">
            <h2>Lista de Oradores</h2>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Titulo</th>
                        <th>Tema</th>
                        <th>Fecha Alta</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        // Crear una instancia de OradoresDAO para acceder a la base de datos
                        OratorsDAO oradoresDAO = new OratorsDAO();

                        // Obtener la lista de oradores desde la base de datos
                        List<Orator> oradores = oradoresDAO.getAll();

                        if (oradores != null && !oradores.isEmpty()) {
                            // Iterar sobre la lista de oradores y mostrar sus datos en la tabla
                            for (Orator orador : oradores) {
                    %>
                    <tr>
                        <td><%= orador.getId()%></td>
                        <td><%= orador.getName()%></td>
                        <td><%= orador.getLastName()%></td>
                        <td><%= orador.getTitle()%></td>
                        <td><%= orador.getTopic()%></td>
                        <td><%= orador.getSavedDate()%></td>
                    </tr>
                    <%
                        }
                    } else {
                    %>
                    <tr>
                        <td colspan="5">No hay oradores registrados.</td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            
            <!-- Botón para volver al índice -->
            <a href="../" class="btn btn-success">Volver</a> 
            
            <div class="row mt-auto">
              <div class="d-grid gap-2 col-4 mx-auto">
                <a href="../" class="btn btn-success btn-outlin mt-4 mb-4">Volver</a> 
                <a href="../" class="btn btn-sucess btn-lg fw-bold mt-4 mb-4">Volver</a>
              </div>
            </div>
            
        </div>
    </body>
</html>
