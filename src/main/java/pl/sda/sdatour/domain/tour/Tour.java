package pl.sda.sdatour.domain.tour;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.sdatour.domain.city.City;
import pl.sda.sdatour.domain.hotel.Hotel;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import static java.time.temporal.ChronoUnit.DAYS;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tour {
    @Id
    @GeneratedValue
    Long ID;

    @ManyToMany
    @JoinTable(
            name = "starting_tour_city",
            joinColumns = {
                    @JoinColumn(name = "tour_id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "city_id")})
    private Set<City> startingCities;

    @ManyToMany
    @JoinTable(
            name = "ending_our_city",
            joinColumns = {
                    @JoinColumn(name = "tour_id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "city_id")})
    private Set<City> endingCities;

    LocalDate startingDate;
    LocalDate endDate;

    @OneToOne(mappedBy = "tour",
    fetch = FetchType.EAGER)
    private Hotel hotel;

    long numberOfDays;
    FoodVariant foodVariant;
    BigDecimal adultPrice;
    BigDecimal kidsPrice;

    int numberOfAdults;
    int numberOfKids;


}


