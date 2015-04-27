package com.datacvg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class readExcelServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public readExcelServlet() {
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

		doPost(request,response);
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

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String filePath = new String(request.getParameter("file").getBytes("UTF-8"),"gb2312");
		out.print("<center>导入excel成功！ 文件路径:"+filePath+"<br>");
		out.print("显示导入的数据：<br>");
	try{
		Class.forName ("oracle.jdbc.OracleDriver"); 
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "lin", "lin123");
        PreparedStatement sql_statement = null;
        String jdbc_insert_sql = "INSERT INTO XLS_POI"
                        + "(KEYWORD, TOTAL_COUNT) VALUES"
                        + "(?,?)";
        sql_statement = conn.prepareStatement(jdbc_insert_sql);
		
		
        FileInputStream input_document = new FileInputStream(new File("d:\\lzh\\inport.xls"));
        /* Load workbook */
        HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input_document);
		
			HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);
			
			// we loop through and insert data
//            Iterator<Row> rowIterator = my_worksheet.iterator(); 
            Iterator<Row> rowIterator = my_worksheet.iterator(); 
            
            while(rowIterator.hasNext()) {
                    Row row = rowIterator.next(); 
                    Iterator<Cell> cellIterator = row.cellIterator();
                            while(cellIterator.hasNext()) {
                                    Cell cell = cellIterator.next();
                                    
                                    switch(cell.getCellType()) { 
                                    case Cell.CELL_TYPE_STRING: //handle string columns
                                            sql_statement.setString(1,cell.getStringCellValue()); 
                                            out.print("<br>"+cell.getStringCellValue());
                                            break;
                                    case Cell.CELL_TYPE_NUMERIC: //handle double data
                                            sql_statement.setDouble(2,cell.getNumericCellValue());
                                            out.print(" "+cell.getNumericCellValue());
                                            break;
                                    }
                                   
                            }
            //we can execute the statement before reading the next row
            sql_statement.executeUpdate();
            }
            /* Close input stream */
            input_document.close();
            /* Close prepared statement */
            sql_statement.close();
            /* COMMIT transaction */
            conn.commit();
            /* Close connection */
            conn.close();
			
		out.print("</center>");	
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
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
