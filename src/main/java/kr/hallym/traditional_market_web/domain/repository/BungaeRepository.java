package kr.hallym.traditional_market_web.domain.repository;

import kr.hallym.traditional_market_web.domain.entity.Bungae_Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface BungaeRepository extends JpaRepository<Bungae_Market, Integer> {
    @Override
    ArrayList<Bungae_Market> findAll();
    ArrayList<Bungae_Market> findByCategoryLike(String keyword);
}
