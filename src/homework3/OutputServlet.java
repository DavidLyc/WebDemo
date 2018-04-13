package homework3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/output")
public class OutputServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double rad = Double.parseDouble(request.getParameter("radius"));
        Round r = new Round(rad);
        request.setAttribute("outputGirth", r.getGirth());
        request.setAttribute("outputArea", r.getArea());
        request.getRequestDispatcher("/output.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
