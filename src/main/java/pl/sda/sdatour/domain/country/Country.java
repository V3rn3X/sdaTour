package pl.sda.sdatour.domain.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.sdatour.domain.city.City;
import pl.sda.sdatour.domain.continent.Continent;
import pl.sda.sdatour.domain.continent.ContinentEnum;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Data
@Entity
public class Country {

    @Id
    String name;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;

    @OneToMany(mappedBy = "country")
    private List<City> cities;


}
