package dio.lab_api_rest.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ItemBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icone;

    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icone;
    }

    public void setIcon(String icone) {
        this.icone = icone;
    }

    public String getDescription() {
        return descricao;
    }

    public void setDescription(String descricao) {
        this.descricao = descricao;
    }

}