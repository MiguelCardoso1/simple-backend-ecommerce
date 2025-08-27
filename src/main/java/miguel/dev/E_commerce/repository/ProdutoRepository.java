package miguel.dev.E_commerce.repository;

import miguel.dev.E_commerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
