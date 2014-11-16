package com.mta.javacourse;
import java.io.IOException;
import javax.servlet.http.*;
@SuppressWarnings("serial")

public class Liron_project_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int num1, num2, num3,radius;
		num1=4;
		num2=3;
		num3=7;
		radius=50;
		int result=(num1+num2)*num3;
		double area=Math.PI*(radius*radius);
		double resultofpower=Math.pow(20,13);
		double degrees = 30;
		double radians2 = Math.sin(Math.toRadians(degrees));
     	 double lengthofopposite=50*radians2;
		String line1 = new String("calculation 1: Area of circle with radius ("+radius+") is ("+area+") square cm ");
		String line2 = new String("calculation 2: Length of opposite where angle 30 degree and Hypotenus is 50 cm is :("+lengthofopposite+")");
		String line3 = new String("calculation 3: Power of 20 with exp 	of 13 is ("+resultofpower+")");
		String resultStr = new String("<h1>Result of ( "+num1+"+"+num2+") *"+num3+"="+result+"</h1>");
		String resultStr2 = line1 + "<br>" + line2 + "<br>" +line3;
		resp.setContentType("text/html");
    	resp.getWriter().println("Exercise 2 :<br>");
		resp.getWriter().println(resultStr);
    	resp.getWriter().println("Exercise 3 :<br><br>");
		resp.getWriter().println(resultStr2);

	}
	
}

