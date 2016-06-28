package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Enterprice;
import pe.com.peruInka.core.domain.StatusEnterprice;

public class EnterpriceDAOImpl  extends BaseDAOHibernate implements EnterpriceDAO{

	public List<Enterprice> findAllEnterprice() {
		return find(Enterprice.class, "from Enterprice");
	}

	public List<StatusEnterprice> findStatusEnterprice() {
		return find(StatusEnterprice.class, "from StatusEnterprice");
	}

	public void saveEnterprice(Enterprice enterprice) {
		save(enterprice);
	}

	public void deleteEnterprice(Long id) {
		Enterprice enterprice = new Enterprice();
		enterprice.setId(id);

		delete(enterprice);
	}

	public Enterprice findEnterpriceById(Long id) {
		return findById(Enterprice.class, id);
	}

	public Enterprice searchEnterprice(Long id) {
		return findById(Enterprice.class, id);
		
	}

}
