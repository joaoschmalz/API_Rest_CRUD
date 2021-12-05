package management.suppliers.controller;

import management.suppliers.model.SupplierModel;
import management.suppliers.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class SupplierController {

    @Autowired
    private SupplierRepository sr;

    @CrossOrigin
    @GetMapping(path = "/api/rest/")
    public Iterable<SupplierModel> getAllSupliers(){
        return this.sr.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "/api/rest/{id}")
    public ResponseEntity<SupplierModel> getSupplier(@PathVariable("id") Integer id){
        return sr.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @CrossOrigin
    @PostMapping(path = "/api/rest/")
    public SupplierModel save(@RequestBody SupplierModel supplier){
        return sr.save(supplier);
    }

    @CrossOrigin
    @PutMapping(path = "/api/rest/{id}")
    public SupplierModel update(@PathVariable String cnpj, @RequestBody SupplierModel supplierModel){
        return null;
    }

    @CrossOrigin
    @DeleteMapping(path = "/api/rest/{id}")
    public void detele(@PathVariable Integer id){
        sr.deleteById(id);
    }

}
