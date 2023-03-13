import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class p2 extends HttpServlet {

    String stud_list[][] = { { "311120104003", "Abdullah", "98", "1" }, { "311120104051", "Saam", "86", "4" },
            { "311120104043", "Paul", "85", "5" },
            { "311120104002", "Aaron", "90", "3" },
            { "311120104062", "Vibu", "91", "2" } };

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String x = request.getParameter("reg_no");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        for (int i = 0; i < 5; i++) {
            if (x.equals(stud_list[i][0])) {
                out.println("<html><body>");
                out.println("<h1>Data of " + x + ":</h1><br/>");
                out.println("<h1>Name: " + stud_list[i][1] + "</h1>");
                out.println("<h1>Mark: " + stud_list[i][2] + "</h1>");
                out.println("<h1>Rank: " + stud_list[i][3] + "</h1>");
                out.println("</body></html>");
                return;
            }
        }
        out.println("<html><head></head><body><h1>Register number not found</h1></body></html>");
    }
}
