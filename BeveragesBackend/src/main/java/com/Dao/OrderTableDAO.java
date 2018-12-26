package com.Dao;

import java.util.List;

import com.Model.OrderTable;

public interface OrderTableDAO {
	
	public boolean save(OrderTable orderTable);
	public List<OrderTable> list(String userId);

}
