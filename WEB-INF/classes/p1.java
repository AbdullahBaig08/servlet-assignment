import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class p1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        final Object[][] objArr = new Object[4][3];

        objArr[0][0] = "Abdullah";
        objArr[0][1] = 25;
        objArr[0][2] = "Cricket";

        objArr[1][0] = "Saam";
        objArr[1][1] = 30;
        objArr[1][2] = "Football";

        objArr[2][0] = "Vibu";
        objArr[2][1] = 45;
        objArr[2][2] = "Volleyball";

        objArr[3][0] = "Paul";
        objArr[3][1] = 51;
        objArr[3][2] = "Basketball";

        int x = Integer.parseInt(request.getParameter("sel"));
        x = x - 1;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Data of " + x + ":</h1><br/>");
        out.println("<h1>" + objArr[x][0] + "</h1>");
        out.println("<h1>" + objArr[x][1] + "</h1>");
        out.println("<h1>" + objArr[x][2] + "</h1>");
        out.println("</body></html>");
    }
}
