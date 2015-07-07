package be.vdab.repository;

import be.vdab.domain.CarMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeRepository extends JpaRepository<CarMake, Integer> {
}
