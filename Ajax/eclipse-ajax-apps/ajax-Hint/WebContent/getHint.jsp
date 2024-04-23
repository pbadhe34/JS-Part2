

<% response.setHeader("Cache-Control", "no-cache");

String Names[]= new String[15];
 
Names[0]="Anna";
Names[1]="Soha";
Names[2]="Cinderella";
Names[3]="Diana";
Names[4]="Kate";
Names[5]="Asha";
Names[6]="Vijaya";
Names[7]="Lisa";
Names[8]="Rani";
Names[9]="Preiti";
Names[10]="Sania";
Names[11]="Maya";
Names[12]="Shweta";
Names[13]="Megha";
Names[14]="Putana";
 
String name=request.getParameter("name");
String hint="";
  
if( name.length()>0)
{
 	for(int i = 0; i < 15; i++)
	{
       
	   String info=Names[i].substring(0,name.length());
	    
       if(info.equalsIgnoreCase(name))
		{
	      if (hint=="")
            hint=Names[i];
          else
            hint=hint + " , "+ Names[i];
	     } 
	}
 }  

if (hint=="")
  out.print("no suggestion");
else
  out.print(hint);
 
%>