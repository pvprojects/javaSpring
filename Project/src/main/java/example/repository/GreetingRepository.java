package example.repository;

import example.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Paulo Vieira
 */

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
