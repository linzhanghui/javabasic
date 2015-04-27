<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="java.io.*,java.sql.*,javax.sql.* ,javax.naming.*"
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Excel Jsp 数据操作</title>
</head>
<body>
<center><p></p>
	<h3>Excel Jsp 数据操作</h3>
	<%
		if(request.getAttribute("err")!=null){
	 %>
	 	<font size="2" colr="red"><%=request.getAttribute("err")%></font>
	<%
		}
	 %>
	<table height="250px">
	<tr>
	<td>
	
	
	<form action="uploadFile" method="post">1.请上传附件：
			<input type="file" name="file">
			<input type="submit" value="导入并解析">
	</form>
	</td>
	</tr>
	<tr></tr>
	<p></p>
	<tr><td>
	2.选择要导出为Excel的数据库表： 	<form action="getExcelOutServlet" method="post">
<%
		String sDBDriver = "oracle.jdbc.driver.OracleDriver"; 
		String sConnStr = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		Connection conn = null; 
		ResultSet rs = null; 
		Statement stmt = null; 
	try 
	{ 
		Class.forName(sDBDriver); 
		conn = DriverManager.getConnection(sConnStr,"lin","lin123"); 
		stmt = conn.createStatement(); 
		rs = stmt.executeQuery("select table_name from user_tables"); 
%>
<select name='dataschema'>
<%
		while (rs.next()){ 
			out.println("<option>" + rs.getString(1)+"</option>"); 
		} 
	rs.close(); 
	} 
	catch(Exception e) 
	{ 
	out.println(e); 
	}
 %>
</select>
		
			<input type="submit" value="导出并下载">
		</form>
		</td>
		</tr>
		</table>
	      <font size="2" color="red">
	      </font><p></p><p></p><p></p><p></p><p></p><p></p>
	      <hr width="50%">
	      @ 20141124
</center>
</body>
</html>
