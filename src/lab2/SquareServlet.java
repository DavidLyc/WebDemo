package lab2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/0121510870318-梁宇成/square")
public class SquareServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table align=\"center\" border=\"1\" cellspacing=\"0\" style=\"font-size:20px\"");
        //输出平方表
        out.println("<tr>");
        for (int i = 0; i < 10; ++i) {
            out.println("<td align=\"center\">");
            out.println("&nbsp;&nbsp;" + i + "&nbsp;&nbsp;");
            out.println("</td>");
        }
        out.println("</tr>");
        out.println("<tr>");
        for (int i = 0; i < 10; ++i) {
            out.println("<td align=\"center\">");
            out.println(i * i);
            out.println("</td>");
        }
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
