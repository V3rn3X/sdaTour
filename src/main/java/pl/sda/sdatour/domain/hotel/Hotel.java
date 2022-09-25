package pl.sda.sdatour.domain.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.sdatour.domain.city.City;
import pl.sda.sdatour.domain.tour.Tour;

import javax.persistence.*;

@NoArgsConstructor
@Data
@AllArgsConstructor(staticName = "of")
@Entity
public class Hotel {

    @Id
    @GeneratedValue
    Long ID;
    String name;
    HotelStandard standard;
    String description;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "tour_id")
    private Tour tour;
}
