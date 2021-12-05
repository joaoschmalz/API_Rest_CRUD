package management.suppliers.model;

import javax.persistence.*;

@Entity(name = "supplier")
public class SupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    @Column(nullable = false, length = 50)
    public String name;
    @Column(nullable = false, length = 150)
    public String email;
    @Column(nullable = false, length = 4000)
    public String comment;
    @Column(nullable = false, unique = true, length = 14)
    public String cnpj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
