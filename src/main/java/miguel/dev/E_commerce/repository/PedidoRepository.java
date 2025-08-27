package miguel.dev.E_commerce.repository;

import miguel.dev.E_commerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
