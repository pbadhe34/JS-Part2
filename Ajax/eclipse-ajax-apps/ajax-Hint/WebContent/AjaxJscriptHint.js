var xmlHttp

function showHint(str)
{
 if (str.length==0)
  { 
  document.getElementById("txtHint").innerHTML="";
  return;
  }
  xmlHttp=GetXmlHttpObject()
  if (xmlHttp==null)
  {
  alert ("Your browser does not support AJAX!");
  return;
  } 
	var url="getHint.jsp";
	url=url+"?name="+str; 
	xmlHttp.onreadystatechange=stateChanged;
	xmlHttp.open("GET",url,true);
	xmlHttp.send(null);
} 

function stateChanged() 
{ 
	if (xmlHttp.readyState==4)
	{ 
      //Use DOM to get the element and update it with the response text
	  document.getElementById("txtHint").innerHTML=xmlHttp.responseText;
	}
}

function GetXmlHttpObject()
{
 var xmlHttp=null;
 try
  {
  // Firefox, Opera 8.0+, Safari
  xmlHttp=new XMLHttpRequest();
  }
 catch (e)
  {
  // Internet Explorer
  try
    {
    xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
    }
  catch (e)
    {
    xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
  }
 return xmlHttp;
}