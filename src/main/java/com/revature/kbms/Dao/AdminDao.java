package com.revature.kbms.Dao;

import java.util.List;
import java.sql.SQLException;
import com.revature.kbms.model.*;

public interface AdminDao {

	public List<Product> getProducts() throws SQLException;
}
