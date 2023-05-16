<%-- 
    Document   : addnewproduct
    Created on : Mar 17, 2023, 12:57:22 PM
    Author     : Phuoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="add" method="post">
            <div>Name:<input type="text" name="productname"/></div>
            <div>Img(link):<input type="url" name="productimg"/></div>
            <div>Price:<input type="text" name="productprice" /></div>
            <div>Title:<input type="text" name="producttitle"></div></div>
            <div>Description:<input type="text" name="productdes"/></div>
            <input type="submit"/>
        </form>
    </body>
</html>
