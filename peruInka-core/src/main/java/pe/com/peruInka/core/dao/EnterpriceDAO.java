package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Enterprice;
import pe.com.peruInka.core.domain.StatusEnterprice;

public interface EnterpriceDAO {

	List<Enterprice> findAllEnterprice();

	List<StatusEnterprice> findStatusEnterprice();

	void saveEnterprice(Enterprice enterprice);

	void deleteEnterprice(Long id);

	Enterprice searchEnterprice(Long id);

}
