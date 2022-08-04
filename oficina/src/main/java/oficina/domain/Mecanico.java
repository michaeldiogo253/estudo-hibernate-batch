package oficina.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_MECANICO")
@NoArgsConstructor
@Getter
public class Mecanico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;
    private String nome;
    private Integer idade;

    public Mecanico(String nome, Integer idade) {

        this.nome = nome;
        this.idade = idade;
    }
}
