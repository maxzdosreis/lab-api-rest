package dio.lab_api_rest.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_cartao")
public class Cartao{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    @Column(name = "limite_avaliado", precision = 13, scale = 2)
    private BigDecimal limite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return numero;
    }

    public void setNumber(String numero) {
        this.numero = numero;
    }

    public BigDecimal getLimit() {
        return limite;
    }

    public void setLimit(BigDecimal limite) {
        this.limite = limite;
    }

}