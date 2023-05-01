package bicicleta.bicicleta;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {
    List<Bicicleta> findByMarca(String marca);

    Bicicleta save(Bicicleta bicicleta);

    void delete(Bicicleta bicicleta);

    List<Bicicleta> findAll();

    Optional<Bicicleta> findById(Long id);
}
