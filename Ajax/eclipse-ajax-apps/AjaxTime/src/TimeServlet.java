import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.text.*;

public class TimeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 11L;
    
    public void doGet(HttpServletRequest request, 
           HttpServletResponse response) 
        throws IOException, ServletException 
    {
		//No caching by browser for this response page
		response.setHeader("Cache-Control", "no-cache");

       //indicate to browser I am sending text of html language
        response.setContentType("text/html");

		//get the writer to write response to current browser client
        PrintWriter out = response.getWriter();	

		 //Create Date object to represent date and time
        Date today = new Date();
         
        //Create the date formatter object to format the date-time
        DateFormat formatter = 
        DateFormat.getTimeInstance(DateFormat.MEDIUM);
		//Format the time sent to browser
        String result = formatter.format(today);
        
        try {
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        out.println("Current Time :  "+result);        
		  		 
         
    }

	public void doPost(HttpServletRequest request, 
           HttpServletResponse response) 
        throws IOException, ServletException 
	{
      doGet(request,response);
	}
}
