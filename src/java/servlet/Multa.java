/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WILLIAM
 */
public class Multa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            String multa = request.getParameter("multa");
            double monto = 0;
            if (multa.equals("Alta Velocidad")) {
                monto = 450;
            }
            if (multa.equals("Pasa Luz Roja")) {
                monto = 300;
            }
            if (multa.equals("Estacionar Zona Pro")) {
                monto = 500;
            }
            if (multa.equals("Pico Placa")) {
                monto = 320;
            }
            double monto2 = monto;
            JsonObject gson = new JsonObject();
            gson.addProperty("monto2", monto2);
            out.print(gson.toString());
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
