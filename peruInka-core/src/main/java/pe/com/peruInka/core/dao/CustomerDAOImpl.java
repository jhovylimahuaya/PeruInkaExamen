package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.StatusCustomer;


public class CustomerDAOImpl extends BaseDAOHibernate implements CustomerDAO {
	
	public List<Customer> findAllCustomer() {
		return find(Customer.class, "from Customer");
	}

	public List<StatusCustomer> findStatusCustomer() {
		return find(StatusCustomer.class, "from StatusCustomer");
	}

	public void saveCustomer(Customer customer) {
		save(customer);
	}

	public void deleteCustomer(Long id) {
		Customer customer = new Customer();
		customer.setId(id);

		delete(customer);
	}

	public Customer findCustomerById(Long id) {
		return findById(Customer.class, id);
	}

	public Customer searchCustomer(Long id) {
		return findById(Customer.class, id);
		
	}

	

}
