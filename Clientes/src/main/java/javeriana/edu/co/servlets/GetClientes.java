package javeriana.edu.co.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javeriana.edu.co.GetClientesRemote;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *  implementation class GetClientes
 */
@WebServlet("/getClientes")
public class GetClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try 
		{
			//Sample 03: Lookup for the Bean in EJB Project
			InitialContext context = new InitialContext();
			GetClientesRemote remoteInterface = (GetClientesRemote) 
					context.lookup("java:global/Taller1/ImplDB/GetClientes!javeriana.edu.co.GetClientesRemote");
			
			//Sample 04: Call the Remote Method
			String str = remoteInterface.SayHello();
			
			//Sample 05: 
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print(str);
		} 
		catch (NamingException e) {
			
			e.printStackTrace();
		}
	}

}
