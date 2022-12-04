package kr.hallym.traditional_market_web.domain.repository;

import kr.hallym.traditional_market_web.domain.entity.Search_Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface SearchRepository extends JpaRepository<Search_Keyword, Long> {
    @Override
    ArrayList<Search_Keyword> findAll();
}
