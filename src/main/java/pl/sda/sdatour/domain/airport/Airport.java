package pl.sda.sdatour.domain.airport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.sdatour.domain.city.City;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Data
public class Airport {
    @Id
    @GeneratedValue
    Long ID;

    String name;

    @OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "city_id")
    private City city;
}
