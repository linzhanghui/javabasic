package com.datacvg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

//import com.intyt.sheet.BoardConfBean;

public class getExcelOutServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public getExcelOutServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HSSFWorkbook workbook = new HSSFWorkbook();
		 CreationHelper createHelper = workbook.getCreationHelper();
		    Sheet sheet = workbook.createSheet("new sheet");
		    	
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
				
				rs = stmt.executeQuery("select * from TESTTABLE"); 
				int rowCount=0;
					//得到结果集数
				while (rs.next())
				{ 
					Row row = sheet.createRow((short)rowCount);
					row.createCell(0).setCellValue(rs.getString(1));
					row.createCell(1).setCellValue(rs.getString(2));
					row.createCell(2).setCellValue(rs.getString(3));
					rowCount++;
				} 
			rs.close(); 
			} 
			catch(Exception e) 
			{ 
				System.out.println(e); 
			}
		try {
		    FileOutputStream out = 
		            new FileOutputStream(new File("d:\\lzh\\new.xls"));
		    
		    workbook.write(out);
		    out.close();
		    System.out.println("Excel written successfully..");
		     
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}

		response.setContentType("text/html;charset=utf-8");		
//		String filePath = new String(request.getParameter("file").getBytes("UTF-8"),"gb2312");
		PrintWriter out = response.getWriter();
		out.println("数据已导出到d:\\new.xls");
		out.println("");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
