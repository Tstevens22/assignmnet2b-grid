package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {

	List<Order> orders = new ArrayList<Order>();

	public Orders() {
		orders.add(new Order("001", "Product #1", (float) 5.00, 1));
		orders.add(new Order("002", "Product #2", (float) 6.00, 3));
		orders.add(new Order("003", "Product #3", (float) 7.00, 5));
		orders.add(new Order("004", "Product #4", (float) 8.00, 7));
		orders.add(new Order("005", "Product #5", (float) 9.00, 9));

	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
