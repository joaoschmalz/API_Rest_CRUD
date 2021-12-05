package management.suppliers.repository;

import management.suppliers.model.SupplierModel;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<SupplierModel, Integer> {
}
