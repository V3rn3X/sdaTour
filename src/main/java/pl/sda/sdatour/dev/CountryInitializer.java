package pl.sda.sdatour.dev;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.sdatour.domain.country.Country;
import pl.sda.sdatour.domain.country.CountryRepository;

import javax.annotation.PostConstruct;

import static pl.sda.sdatour.domain.continent.ContinentEnum.*;

@Component
@RequiredArgsConstructor
public class CountryInitializer {

    private final CountryRepository repository;

    @PostConstruct
    void initializerCountry() {

    }
}
