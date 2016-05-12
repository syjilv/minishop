package product.service;

import static fw.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import product.dao.ProductDAO;
import product.dao.ProductDAOImpl;
import product.dto.ProductDTO;


public class ProductServiceImpl implements ProductService {

	@Override
	public ArrayList<ProductDTO> productlist(String category) {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		System.out.println("¼­ºñ½º : " + category);
		Connection conn = getConnect();
		ProductDAO dao = new ProductDAOImpl();
		try {
			list = dao.productlist(conn, category);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return list;
	}

	@Override
	public ArrayList<ProductDTO> searchTopProduct() {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		Connection conn = getConnect();
		ProductDAO dao = new ProductDAOImpl();
		try {
			list = dao.searchTopProduct(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return list;
	}
	
	@Override
	public ProductDTO read(String prd_no) {
		// TODO Auto-generated method stub
		return null;
	}
}
