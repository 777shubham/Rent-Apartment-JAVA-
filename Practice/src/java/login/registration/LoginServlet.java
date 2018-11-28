
package login.registration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet
{
   @Override
   public void service (HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
       String Email =req.getParameter("email");
       String Password = req.getParameter("password");
       LoginBean LB = new LoginBean();
       LB.setEmail(Email);
       LB.setPassword(Password);
       loginDao LDD = new loginDao();
       Boolean check=LDD.getLogIn(LB);
        if(check==true)
        {
            HttpSession session=req.getSession(true);
            session.setAttribute("Email",Email);
            session.setMaxInactiveInterval(3000);
            res.sendRedirect("front.jsp");
        }
        else
        {
            PrintWriter out=res.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Useremail or Password Incorrect');");
            out.println("location='Login.jsp';");
            out.println("</script>");
//            req.setAttribute("errMessage", check);
//            
//            req.getRequestDispatcher("/Login.jsp").forward(req, res);
        }
   }
}
