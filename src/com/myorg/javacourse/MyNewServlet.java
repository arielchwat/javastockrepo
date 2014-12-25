package com.myorg.javacourse;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpServer;

public class MyNewServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		int radius = 50;
		double area = Math.PI*(radius*radius);
		String line1 = new String("<h1>calculation 1: Area of circle with radius"+" "+radius+"cm"+" "+"is"+" "+area+" "+"square-cm.</h1>");
		int angleB = 30;
		double x = 30;
		x = Math.toRadians(x);
		double B = Math.sin(x);
		int hypotenuse = 50;
		String line2 = new String("<h1>calculation 2: Length of opposite where angle B is "+angleB+" degrees and Hypotenuse length is "+hypotenuse+" cm is:"+" "+(B*hypotenuse)+"cm.</h1>");
		
		int z = 20;
		int y = 13;
		double power = Math.pow(z, y);
		String line3 = new String("<h1>calculation 3: Power of"+" "+z+" with exp of "+13+" is "+power+".</h1>");
		
		String resultStr = line1 + "<br>" + line2 + "<br>" +line3;
		resp.getWriter().println(resultStr);
	
	}

}
