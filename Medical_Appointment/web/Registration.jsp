<%-- 
    Document   : Registration
    Created on : Jul 30, 2018, 1:57:41 AM
    Author     : Olku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    <body>
            <script type="text/javascript">
           function check(form){
             
               var pass = document.myForm.pass.value;
               if((pass=="") || (pass.length<4)){
                  alert("password is invalid,,, must be 4 charecter..");
                   document.myForm.pass.focus();
                   return false;  
               }
               var email = document.myForm.email.value;
               if(email==""){
                  alert("email empty");
                   document.myForm.email.focus();
                   return false;  
               }
                var email = document.myForm.email.value;
              if(email.indexOf('@')<=0){
                   alert("Wrong email address..");
                   document.myForm.email.focus();
                   return false;  
              }
               var email = document.myForm.email.value;
              if( (email.charAt(email.length-4)!='.') && (email.charAt(email.length-3)!='.') ){
                   alert("Wrong email address..");
                   document.myForm.email.focus();
                   return false;
              }
              
              var gender = document.myForm.gender.value;
              if( (gender!="Male") && (gender!="Female")){
                  alert("Insert Male Or Female as gender..");
                  document.myForm.gender.focus();
                  return false;
              }
               
                 
               
           } 
           
        </script>
    <body>
        
    <div id="header">
		 <div id= "logo"></div>
		 <div id= "nav">
		 	<ul id ="list">
		 		<li><a href="Login.jsp"> Login</li>   </a>
		 		<li><a href="Registration.jsp"> Registration </li>  </a>
		 		<li><a href="#"> Get Appointment </li></a>
		 		<li><a href="#"> Account </li></a>
		 		<li><a href="#"> About </li>  </a>
		 	</ul>
		 </div>
		
    </div>
    <div id="sign_info"
         <font size="+2"> Join with our community... <font>
      </div>
        
      <div id = "para">
          <form name="myForm" action="Registration" method="post" onsubmit="return check(this);">
   
            Name: <br> <input type="text" name="name" required><br><br> 
            Email: <br> <input type="text" name="email" > <br> <br>
            
            Password: <br> <input type="text" name="pass" required> <br> <br>
            Age :<br>  <input type="text" name="age" required> <br> <br>
            Gender: <br> <input type="text" name="gender" required> <br> <br>
            Address:<br>  <input type="text" name="address" required> <br> <br>
            <br>  <input type="submit" id="sub" value="Sign Up"  width="128" height="128"> 
            
        </form>
          
      </div>
        
     <div id ="Footer">
	 
		<div id="copy">		 
				Copyright &copy Saiful Islam.
                                
		 </div>	 

	</div>
  
    </body>
</head>

</html>
