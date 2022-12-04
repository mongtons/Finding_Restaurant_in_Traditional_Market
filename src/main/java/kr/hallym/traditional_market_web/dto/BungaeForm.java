package kr.hallym.traditional_market_web.dto;

import kr.hallym.traditional_market_web.domain.entity.Bungae_Market;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class BungaeForm {
    private Integer id;
    private String title;
    private String category;
    private String content;
    private String address;
    private Integer discount;
    public Bungae_Market toEntity(){
        return new Bungae_Market(id, title, category, content, address, discount);
    }
}
