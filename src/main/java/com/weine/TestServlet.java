package com.weine;


import com.weine.entities.Product;
import com.weine.services.TestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TestService testService = new TestService();
        List<Product> products = testService.getProducts();
        for (Product product : products){
            resp.getWriter().write(product.toString());
        }

        resp.getWriter().write("Userito");
        resp.getWriter().write("Users");
    }
}
