package kr.hallym.traditional_market_web.domain.repository;

import kr.hallym.traditional_market_web.domain.entity.Pungmul_Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PungmulRepository extends JpaRepository<Pungmul_Market, Long> {
    @Override
    ArrayList<Pungmul_Market> findAll();
    ArrayList<Pungmul_Market> findByCategoryLike(String keyword);
}
