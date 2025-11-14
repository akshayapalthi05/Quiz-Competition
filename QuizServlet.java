package com.quiz;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuizServlet extends HttpServlet {

    String questions[] = {
        "What is the capital of India?",
        "Which language is used for Android development?",
        "2 + 2 = ?"
    };

    String options[][] = {
        {"Delhi", "Mumbai", "Chennai", "Kolkata"},
        {"Java", "Python", "C", "Ruby"},
        {"2", "3", "4", "5"}
    };

    int answers[] = {1, 1, 3};

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("questions", questions);
        req.setAttribute("options", options);

        RequestDispatcher rd = req.getRequestDispatcher("quiz.jsp");
        rd.forward(req, resp);
    }
}