package pl.sda.sdatour.domain.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.sdatour.domain.airport.Airport;
import pl.sda.sdatour.domain.country.Country;
import pl.sda.sdatour.domain.hotel.Hotel;
import pl.sda.sdatour.domain.tour.Tour;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Data
@Entity
public class City {

    @Id
    String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<Hotel> hotels;

    @OneToOne(mappedBy = "city", fetch = FetchType.EAGER)
    private Airport airport;

    @ManyToMany(mappedBy = "startingCities")
    private Set<Tour> startingTours;

    @ManyToMany(mappedBy = "endingCities")
    private Set<Tour> endingTours;

}
