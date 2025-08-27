package miguel.dev.E_commerce.repository;

import miguel.dev.E_commerce.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
