package miguel.dev.E_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String endereço;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
    private List<Pedido> pedidos;
}
