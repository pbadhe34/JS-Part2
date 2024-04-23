 

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

 
public class AutoCompleteServlet extends HttpServlet
{

    private List names = new ArrayList();
  //Initialise the list of names
    public void init(ServletConfig config) throws ServletException 
	{
        names.add("Vijay");
        names.add("Ashok");
        names.add("Munna");
        names.add("Sania");
        names.add("John");
        names.add("Mohan");
        names.add("Shilpa");
        names.add("Trupti");
        names.add("Marie");
    }
    
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
	{
        String prefix = request.getParameter("names");
        NameService service = NameService.getInstance(names);
        List matching = service.findNames(prefix);

        if (matching.size() > 0) 
		{
            PrintWriter out = response.getWriter();

            response.setContentType("text/xml");
			//Set No cahing in Browser
            response.setHeader("Cache-Control", "no-cache");

            out.println("<response>");
            Iterator iter = matching.iterator();
            while(iter.hasNext()) 
			{
                String name = (String) iter.next();
                out.println("<name>" + name + "</name>");
            }
            out.println("</response>");
            matching = null;
            service = null;
            out.close();
        } else 
		{
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            
        }

    }
    
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
	{
        doGet(request, response);
    }
        
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "AutoComplete Servlet";
    }
}
