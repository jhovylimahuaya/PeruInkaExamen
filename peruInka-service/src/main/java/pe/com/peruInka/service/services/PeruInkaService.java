package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.CustomerDAO;
import pe.com.peruInka.core.dao.EnterpriceDAO;
import pe.com.peruInka.core.dao.HotelDAO;
import pe.com.peruInka.core.dao.PersonDAO;
import pe.com.peruInka.core.dao.ProductDAO;
import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.Enterprice;
import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.core.domain.StatusEnterprice;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.core.domain.UserSystem;

@Service("peruInkaService")
public class PeruInkaService {

	public static List<Person> listPerson = new ArrayList<Person>();

	@Autowired
	private PersonDAO personDAO;

	@Autowired
	private HotelDAO hotelDAO;

	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private EnterpriceDAO enterpriceDAO;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	
	public void deleteUserSystem(Long id) {
		UserSystem userSystem = personDAO.findUserSystemById(id);
		personDAO.deleteUserSystem(userSystem);
	}

	public UserSystem findUserSystemById(Long id) {
		return personDAO.findUserSystemById(id);
	}

	public List<StatusUser> findStatusUser() {
		return personDAO.findStatusUser();
	}

	public List<TypeDocument> findTypeDocument() {
		return personDAO.findTypeDocument();
	}

	public List<StatusPerson> findStatusPerson() {
		return personDAO.findStatusPerson();
	}

	public List<pe.com.peruInka.core.domain.Person> findAllPerson() {
		return personDAO.findAllPerson();
	}

	public void savePerson(pe.com.peruInka.core.domain.Person person) {
		personDAO.savePerson(person);
	}

	public List<UserSystem> findUserSystem() {
		return personDAO.findUserSystem();
	}

	public void saveUserSystem(UserSystem userSystem) {
		if (userSystem.getId() == null) {
			personDAO.saveUserSystem(userSystem);
		} else {
			personDAO.updateUserSystem(userSystem);
		}
	}

	public void deletePerson(Long id) {
		Person p = new Person();
		p.setId(id);
		personDAO.deletePerson(p);
	}

	public void updatePerson(Person personUpdate) {
		personDAO.savePerson(personUpdate);
	}

	public Person searchPerson(Long id) {
		Person personReturn = personDAO.findPersonById(id);

		return personReturn;
	}

	public List<Hotel> findAllHotel() {
		return hotelDAO.findAllHotel();
	}

	public List<StatusHotel> findStatusHotel() {
		return hotelDAO.findStatusHotel();
	}

	public void saveHotel(Hotel hotel) {
		hotelDAO.saveHotel(hotel);
	}

	public void deleteHotel(Long id) {
		hotelDAO.deleteHotel(id);
	}

	public Hotel searchHotel(Long id) {
		return hotelDAO.findHotelById(id);
	}

	
	public List<Product> findAllProduct() {
		return productDAO.findAllProduct();
	}

	public List<StatusProduct> findStatusProduct() {
		return productDAO.findStatusProduct();
	}

	public void saveProduct(Product product) {
		product.setVersion(1);
		productDAO.saveProduct(product);
	}

	public void deleteProduct(Long id) {
		productDAO.deleteProduct(id);
	}

	public Product searchProduct(Long id) {
		return productDAO.searchProduct(id);
	}
	
	
	
	public List<Enterprice> findAllEnterprice() {
		return enterpriceDAO.findAllEnterprice();
	}

	public List<StatusEnterprice> findStatusEnterprice() {
		return enterpriceDAO.findStatusEnterprice();
	}

	public void saveEnterprice(Enterprice enterprice) {
		enterprice.setVersion(1);
		enterpriceDAO.saveEnterprice(enterprice);
	}

	public void deleteEnterprice(Long id) {
		enterpriceDAO.deleteEnterprice(id);
	}

	public Enterprice searchEnterprice(Long id) {
		return enterpriceDAO.searchEnterprice(id);
	}
	
	
	public List<Customer> findAllCustomer() {
		return customerDAO.findAllCustomer();
	}

	public List<StatusCustomer> findStatusCustomer() {
		return customerDAO.findStatusCustomer();
	}

	public void saveCustomer(Customer customer) {
		customer.setVersion(1);
		customerDAO.saveCustomer(customer);
	}

	public void deleteCustomer(Long id) {
		customerDAO.deleteCustomer(id);
	}

	public Customer searchCustomer(Long id) {
		return customerDAO.searchCustomer(id);
	}

}
