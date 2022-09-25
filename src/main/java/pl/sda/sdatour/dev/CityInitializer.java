package pl.sda.sdatour.dev;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.sdatour.domain.city.City;
import pl.sda.sdatour.domain.city.CityRepository;

import javax.annotation.PostConstruct;
@Component
@RequiredArgsConstructor
public class CityInitializer {

    private final CityRepository repository;

    @PostConstruct
    void cityInitializer() {

    }
}
