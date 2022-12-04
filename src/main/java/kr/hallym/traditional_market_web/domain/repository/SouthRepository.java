package kr.hallym.traditional_market_web.domain.repository;

import kr.hallym.traditional_market_web.domain.entity.South_Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface SouthRepository extends JpaRepository<South_Market, Long> {
    @Override
    ArrayList<South_Market> findAll();
    ArrayList<South_Market> findByCategoryLike(String keyword);
}
