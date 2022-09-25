package pl.sda.sdatour.domain.continent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.sdatour.domain.country.Country;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Continent {
    @Id
    @Enumerated(EnumType.STRING)
    ContinentEnum continent;

    @OneToMany(mappedBy = "continent")
    private List<Country> countries;
}
