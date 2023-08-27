package ku.cs.restaurant.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ku.cs.restaurant.entity.Restaurant;

@Repository
public interface RestaurantRepository
        extends JpaRepository<Restaurant, UUID> {
    Restaurant findByName(String name);

    List<Restaurant> findByLocation(String location);

}
