 

 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 
public class NameService 
{
    private static List names;
	static NameService ns;
    
    /** Creates a new instance of NameService */
    private NameService(List list)
	{
        this.names = list;
    }
    
    public static NameService getInstance(List list_of_names)
	{
		if(names==null)
		{
			//If not ijnitialized
			ns = new NameService(list_of_names);
		}
        return ns;
    }
    
    public List findNames(String prefix) 
	{
        String prefix_upper = prefix.toUpperCase();
        List matches = new ArrayList();
        Iterator iter = names.iterator();
        while(iter.hasNext())
		{
            String name = (String) iter.next();
            String name_upper_case = name.toUpperCase();
            if(name_upper_case.startsWith(prefix_upper))
			{        
                boolean result = matches.add(name);
            }
        }
        return matches;
    }
    
}
