<%-- 
    Document   : Login
    Created on : Jul 29, 2018, 8:32:25 PM
    Author     : Olku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   	<title> Medical Appointment </title>
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
        <script type="text/javascript">
           function check(form){
               var name = document.myForm.Uname.value;
               if(name == ""){
                   alert("usename empty");
                   document.myForm.Uname.focus();
                   return false;
               }
               var pass = document.myForm.pass.value;
               if(pass==""){
                  alert("password empty");
                   document.myForm.Uname.focus();
                   return false;  
               }
           } 
           
        </script>

</head>
<body>

	<div id="header">
		 <div id= "logo"></div>
		 <div id= "nav">
		 	<ul id ="list">
		 		<li><a href="#"> Home </li>   </a>
		 		<li><a href="Registration.jsp"> Registration </li>  </a>
		 		<li><a href="#"> Get Appointment </li></a>
		 		<li><a href="Doctor_list"> Account </li></a>
		 		<li><a href="#"> About </li>  </a>
		 	</ul>
		 </div>
		
	</div>

    
    <div id="welcome_text">
        <h1>
            Welcome to our Medical Appointment Website 
        </h1>
    </div>
    
     <div id="sign_info">
         <p1 >
             <font size="+2"> Login Now !! </font>
         </p1>
    </div>
      
	<div id = "para">
            
            <form name="myForm" action="Login" method="post" onsubmit="return check(this);">
               <div id="input">
                   <font size="+1">   Name: </font> <input type="text" name ="Uname" placeholder="User name">  
         
                   <br><br>
               
                     <font size="+1"> Password :  </font>    <input type="text" name="pass" placeholder ="Password">
                 
                    <br><br>
              
                    <input type="submit" id="sub" value="Log in"  width="58" height="58"> 
                        <br><br>
                    </div>
                
            </form>	 
 
	</div>
    
    <div id="sign_info">
        <p> 
            <font size="+1.8"> New Here...!!!  </font>
            <br>
          <a href="Registration.jsp" class="button">Sign Up</a>
            
        </p>
    </div>
         

	<div id ="Footer">
	 
		<div id="copy">		 
				Copyright &copy Saiful Islam.
		 </div>	 

	</div>
    

</body>
</html>
