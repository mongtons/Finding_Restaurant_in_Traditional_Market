package kr.hallym.traditional_market_web.domain.repository;

import kr.hallym.traditional_market_web.domain.entity.Center_Market;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;

public interface CenterRepository extends JpaRepository<Center_Market, Long> {
    @Override
    ArrayList<Center_Market> findAll();
    ArrayList<Center_Market> findByCategoryLike(String keyword);
}
