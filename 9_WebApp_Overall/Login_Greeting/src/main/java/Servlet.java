import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "Servlet", urlPatterns = "/login")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        writer.println("<html>");
        if (username.equals("admin") && password.equals("admin")) {
            writer.println("<h1> Hello " + username + " to the website </h1>");
            writer.println("<img src='ngu.jpg' alt='image' />");
        } else {
            writer.println("<p>login erro</p>");
            writer.println("<script>alert('erro')</script>");
        }
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
