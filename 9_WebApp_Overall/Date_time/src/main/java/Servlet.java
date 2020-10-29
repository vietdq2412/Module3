import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@javax.servlet.annotation.WebServlet(name = "Servlet", urlPatterns = "/mytest")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        Date date = new Date();
        writer.println("<html>");
        writer.println("<h1>"+date+"</h1>");
        writer.println("</html>");
    }
}
