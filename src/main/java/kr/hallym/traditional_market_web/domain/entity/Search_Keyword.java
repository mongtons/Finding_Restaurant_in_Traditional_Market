package kr.hallym.traditional_market_web.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "search_Keyword")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Search_Keyword {
    @Id
    private Integer id;
    @Column(length = 50, nullable = false)
    private String keyword;
}
