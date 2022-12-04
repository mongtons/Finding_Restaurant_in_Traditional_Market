package kr.hallym.traditional_market_web.dto;

import kr.hallym.traditional_market_web.domain.entity.Bungae_Market;
import kr.hallym.traditional_market_web.domain.entity.East_Market;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class EastForm {
    private Integer id;
    private String title;
    private String category;
    private String content;
    private String address;
    private Integer discount;
    public East_Market toEntity(){
        return new East_Market(id, title, category, content, address, discount);
    }
}
