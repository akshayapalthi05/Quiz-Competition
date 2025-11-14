package com.quiz;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {

    int answers[] = {1, 1, 3};

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            String userAns = req.getParameter("q" + i);
            if (userAns != null && Integer.parseInt(userAns) == answers[i]) {
                score++;
            }
        }

        req.setAttribute("score", score);

        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, resp);
    }
}