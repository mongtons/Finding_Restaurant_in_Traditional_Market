package kr.hallym.traditional_market_web.domain.repository;

import kr.hallym.traditional_market_web.domain.entity.West_Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface WestRepository extends JpaRepository<West_Market, Long> {
    @Override
    ArrayList<West_Market> findAll();
    ArrayList<West_Market> findByCategoryLike(String keyword);
}
