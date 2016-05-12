package product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.dto.ProductDTO;
import product.service.ProductService;
import product.service.ProductServiceImpl;

@WebServlet(name = "prdlist", urlPatterns = { "/prdlist.do" })
public class ProductListServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("EUC-KR");
		
		String category = req.getParameter("category");
		String pathurl = req.getParameter("pathurl");
		String forwardview = "";
		ProductService service = new ProductServiceImpl();
		ProductDTO prd = new ProductDTO();
		
		if(category == null) {
			category = "%";
			forwardview = "/layout/indexLayout.jsp";
			ArrayList<ProductDTO> toplist = service.searchTopProduct();
			req.setAttribute("toplist", toplist);
		} else {
			req.setAttribute("pathurl", pathurl);
			forwardview = "/layout/mainLayout.jsp";
		}
		ArrayList<ProductDTO> list = service.productlist(category);
		
		req.setAttribute("list", list);
		RequestDispatcher rd =
				req.getRequestDispatcher(forwardview);
		rd.forward(req, res);
	}
}
