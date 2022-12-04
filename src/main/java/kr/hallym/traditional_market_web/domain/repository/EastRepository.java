package kr.hallym.traditional_market_web.domain.repository;

import kr.hallym.traditional_market_web.domain.entity.East_Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface EastRepository extends JpaRepository<East_Market, Long> {
    @Override
    ArrayList<East_Market> findAll();
    ArrayList<East_Market> findByCategoryLike(String keyword);
}
