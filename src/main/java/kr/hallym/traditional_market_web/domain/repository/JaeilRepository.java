package kr.hallym.traditional_market_web.domain.repository;

import kr.hallym.traditional_market_web.domain.entity.Jaeil_Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface JaeilRepository extends JpaRepository<Jaeil_Market, Long> {
    @Override
    ArrayList<Jaeil_Market> findAll();
    ArrayList<Jaeil_Market> findByCategoryLike(String keyword);
}
