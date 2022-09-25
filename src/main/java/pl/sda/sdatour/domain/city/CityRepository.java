package pl.sda.sdatour.domain.city;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.sdatour.domain.country.Country;

public interface CityRepository extends JpaRepository<City,String> {
}
