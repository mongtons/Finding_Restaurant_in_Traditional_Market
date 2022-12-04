package kr.hallym.traditional_market_web.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bungae_Market")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bungae_Market {
    @Id
    private Integer id;
    @Column(length = 20, nullable = false)
    private String title;
    @Column(length = 20, nullable = false)
    private String category;
    @Column(length = 500)
    private String content;
    @Column(length = 100, nullable = false)
    private String address;
    @Column
    private Integer discount;
}
