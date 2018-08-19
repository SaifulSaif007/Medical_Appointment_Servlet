<%-- 
    Document   : Account
    Created on : Jul 29, 2018, 9:38:13 PM
    Author     : Olku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        
        <title>Account Information</title>
        	<style type="text/css">
		
	#header
	{
		background-color: black;
		height: 100px;
		width: 100%;
	 
	}	

	
	*
	{
		margin: 0;
		padding: 0;

	}

       
	#logo
	{
		margin-top: 20px;
		margin-left: 200px;
		height: 64px;
		width: 64px;
		background-image: url(logo.PNG);
		float: left;
	 
	}

	#nav
	{
		color: white;


	}

	#list

	{
		 
		margin-left: 400px;
		
		list-style: none;
	}

	#nav li
	{
		float: left;
		margin-left: 25px;
		margin-top: 30px;
		padding: 10px;
		border : 1px solid silver;
		border-radius: 8px;
		background-color: #252525
	}

	#nav a
	{
		text-decoration: none;
		color: white;
	}
	#list a:hover
	{
		color: blue;
	}

	#para
	{
		margin-top: 20px;
		margin-left: 100px;
		margin-right: 50px;
                margin-bottom: 50px;
                

	}

	#Footer
	{
		background-color: black;
		color: white;
		height: 100px;
		width: 100%;
		 
		 
	}
 
	#copy

	{
 		height: 30px;
		width: 1100px;
		margin-top: 30px;
		float: left;
		text-align: right;
	 
 

	}
        #input
        {
            height: 150px;
            width: 200px;
            margin-left: 50px;
            
            
        }
         
        #sub
        {
          height: 30px;
          width: 50px;
        
          text-align: center;
          
        
        }
        #welcome_text
        {
            height: 20px;
            padding: 20px;
            text-align: center;
            color: blueviolet;
            margin-top: 50px;
            
        }
        #sign_info
        {
            height: 60px;
            margin-left: 150px;
            margin-top: 20px;
            color: blue;
            
        }
        .button {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    text-align: center;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
  
}


	</style>
    </head>
   
        <div id="header">
		 <div id= "logo"></div>
		 <div id= "nav">
		 	<ul id ="list">
                                <li><a href=Login.jsp"> </li>   </a>
		 		<li><a href="Registration.jsp"> Registration </li>  </a>
		 		<li><a href="#"> Get Appointment </li></a>
		 		<li><a href="#"> Account </li></a>
		 		<li><a href="#"> About </li>  </a>
		 	</ul>
		 </div>
		
	</div>
     
        
       <%
          String name ="";
          String mail ="";
          String age ="";
          String gender="";
          String addr ="";
          String pass = "";
   
          
           HttpSession session2 = request.getSession(false);
          
           if(session2 != null){
               name =session2.getAttribute("Uname").toString();
               mail =session2.getAttribute("Email").toString();
               age  =session2.getAttribute("Age").toString();
               gender = session2.getAttribute("Gender").toString();
               addr   =session2.getAttribute("Addr").toString();  
               pass = session2.getAttribute("pass").toString();
          }
         
           
            %>
            
            <h1>Hello  <%=name %></h1>
        <div id = "para">
             
            
        <form action="Account" method="get">
   
            Name: <br> <input type="text" name="name" value="<%= name %>"><br><br> 
            Email: <br> <input type="text" name="email" value="<%= mail %>" > <br> <br>
            Password: <br> <input type="text" name="pass" value="<%=pass %>"> <br> <br>
            Age :<br>  <input type="text" name="age" value="<%= age %>"> <br> <br>
            Gender: <br> <input type="text" name="gender" value="<%= gender %>"> <br> <br>
            Address:<br>  <input type="text" name="address" value="<%= addr %>"> <br> <br>
            <br>  <input type="submit" id="sub" name="acc" value="Update"  width="58" height="58"> 
            
            <br><br> Get Appointment <input type="submit" id="sub" name="acc" value="Appointment"  width="58" height="58"> 
            </form>
            
            <form action="Doctor_list" method="get">
                <br><br>   See the Doctor list :   <input type="submit" id="sub" value="Doctor"  width="58" height="58"> 
            </form>
                
        </div>
    
        <div id ="Footer">
	 
		<div id="copy">		 
				Copyright &copy Saiful Islam.
                                
		 </div>	 

	</div>
        
    

