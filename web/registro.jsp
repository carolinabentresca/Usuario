<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body style="background: #333333;color: #ffffff">
        <h4>Registro</h4>   
        <hr style="background: #ffffff"/>
        <br/>
        <br/> 
    <center>
        <html:form  action="/registro.do">
            Usuario (*) <br/> 
            <html:text property= "usuario" />  <br/>
            Email (*) <br/>  
            <html:text property= "email" /> <br/>
            Password (*)<br/>
            <html:password property= "password" /> <br/>
            <br/>
            <input type="submit" value="Registrar" style="font-size: 18px; background: #00cc33;color: #ffffff;">
            <br/>   
            <br/> 
            <h6>(*) Campos Obligatorios</h6>  
        </html:form>
    </center>  
</body>
</html>
