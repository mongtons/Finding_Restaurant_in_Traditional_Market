package kr.hallym.traditional_market_web.dto;

import kr.hallym.traditional_market_web.domain.entity.Search_Keyword;
import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class SearchForm {
    private Integer id;
    private String keyword;
    public Search_Keyword toEntity(){
        return new Search_Keyword(id, keyword);
    }
}
