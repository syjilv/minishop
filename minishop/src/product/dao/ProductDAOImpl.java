package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import product.dto.ProductDTO;
import static fw.Query.*;
import static fw.JdbcTemplate.*;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public ArrayList<ProductDTO> productlist(Connection conn, String category)
			throws SQLException {

		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		ProductDTO prd = null;
		PreparedStatement ptmt = conn.prepareStatement(PRD_LIST);
		ptmt.setString(1, category);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
		prd = new ProductDTO(rs.getString(1),
							 rs.getString(2),
							 rs.getString(3),
							 rs.getString(4),
							 rs.getInt(5),
							 rs.getString(6),
							 rs.getString(7),
							 rs.getString(8),
							 rs.getString(9),
							 rs.getString(10),
							 rs.getString(11),
							 rs.getString(12),
							 rs.getString(13),
							 rs.getString(14));
		list.add(prd);
		}
		close(rs);
		close(ptmt);
		return list;
	}

	@Override
	public ArrayList<ProductDTO> searchTopProduct(Connection conn)
			throws SQLException {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		ProductDTO prd = null;
		PreparedStatement ptmt = conn.prepareStatement(PRD_SEARCH_TOP);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
		prd = new ProductDTO(rs.getString(1),
							 rs.getString(2),
							 rs.getString(3));
		list.add(prd);
		}
		close(rs);
		close(ptmt);
		return list;
	}

	@Override
	public ProductDTO read(Connection conn, String prd_no) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
