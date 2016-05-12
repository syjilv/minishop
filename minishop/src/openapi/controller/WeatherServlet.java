package openapi.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import openapi.dto.ParseDTO;
import openapi.service.ParseService;
import openapi.service.ParseServiceImpl;
import product.dto.ProductDTO;

@WebServlet(name = "weather", urlPatterns = { "/weather.do" })
public class WeatherServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("EUC-KR");
		
		String pathurl = req.getParameter("pathurl");
		String forwardview = "";
		ParseService service = new ParseServiceImpl();
		ParseDTO dto = new ParseDTO();
		
		forwardview = "/layout/mainLayout.jsp";
		ArrayList<ParseDTO> weatherList = service.weatherData();

		req.setAttribute("pathurl", pathurl);
		req.setAttribute("weatherlist", weatherList);

		RequestDispatcher rd = req.getRequestDispatcher(forwardview);
		rd.forward(req, res);
	}
}
