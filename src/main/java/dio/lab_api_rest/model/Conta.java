package dio.lab_api_rest.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_conta")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private String agencia;

    @Column(precision = 13, scale = 2)
    private BigDecimal balanco;

    @Column(name = "additional_limit", precision = 13, scale = 2)
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

    public String getAgency() {
        return agencia;
    }

    public void setAgency(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getBalance() {
        return balanco;
    }

    public void setBalance(BigDecimal balanco) {
        this.balanco = balanco;
    }

    public BigDecimal getLimit() {
        return limite;
    }

    public void setLimit(BigDecimal limite) {
        this.limite = limite;
    }
}
