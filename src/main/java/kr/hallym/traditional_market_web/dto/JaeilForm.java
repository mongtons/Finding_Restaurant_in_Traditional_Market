package kr.hallym.traditional_market_web.dto;

import kr.hallym.traditional_market_web.domain.entity.Jaeil_Market;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class JaeilForm {
    private Integer id;
    private String title;
    private String category;
    private String content;
    private String address;
    private Integer discount;
    public Jaeil_Market toEntity(){
        return new Jaeil_Market(id, title, category, content, address, discount);
    }
}
