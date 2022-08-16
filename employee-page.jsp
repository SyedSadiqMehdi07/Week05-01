<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>Employee Form</title>  
</head>  
<h3>Employee Information Form</h3>  
<body>  
    <form:form action="submitForm" modelAttribute="employee">  
        Employee Number : <form:input path="empno" />         
        Employee name: <form:input path="ename" />   
        Employee designation: <form:input path="designation" />  
        Employee salary: <form:input path="salary" />  
 
       
          
        <input type="submit" value="Submit" />  
    </form:form>  
</body>  
</html>  
