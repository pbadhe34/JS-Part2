 

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PostingXMLServlet extends HttpServlet 
{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
	{
        
        String countryName = request.getParameter("SelectCountry");        
        
        
		response.setContentType("text/xml");
        response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();

        out.println("<Response>");
        if(countryName.equals("Canada"))
		{
     		out.println("<State>Alberta</State>");
			out.println("<State>British Columbia</State>");
			out.println("<State>Ontario</State>");
			out.println("<State>Quebec</State>");			 
			out.println("</Response>");
			out.close();
		}
		 if(countryName.equals("USA"))
		{

			out.println("<State>Arizona</State>");
			out.println("<State>California Columbia</State>");
			out.println("<State>Virginia</State>");
			out.println("<State>Washington</State>");			 
			out.println("</Response>");
			out.close();
		}
		 if(countryName.equals("India"))
		{

			out.println("<State>Andhra Pradesh</State>");
			out.println("<State>Delhi</State>");
			out.println("<State>Jammu and Kashmir</State>");
			out.println("<State>Tamil Nadu</State>");
			out.println("<State>Maharashtra</State>");
			out.println("</Response>");
			out.close();
		}         
    }
    
     
}
