package kr.hallym.traditional_market_web.controller;

import kr.hallym.traditional_market_web.domain.entity.*;
import kr.hallym.traditional_market_web.domain.repository.*;
import kr.hallym.traditional_market_web.dto.SearchForm;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Controller
public class Traditional_MarketController {
    private Integer numId=0;
    @Autowired
    private SearchRepository searchr;
    @Autowired
    private final BungaeRepository br;
    @Autowired
    private final CenterRepository cr;
    @Autowired
    private final EastRepository er;
    @Autowired
    private final JaeilRepository jr;
    @Autowired
    private final PungmulRepository pr;
    @Autowired
    private final SouthRepository sr;
    @Autowired
    private WestRepository wr;

    @GetMapping("/jungang")
    public String jungangMarketIndex(Model model){
        List<Center_Market> marketList=cr.findAll();
        model.addAttribute("jungang", marketList);
        return "Jungang";
    }
    @GetMapping("/search")
    public String searchKeyword(Model model){
        List<Search_Keyword> keyword=searchr.findAll();
        String word=keyword.get(keyword.size()-1).getKeyword();
        List list = searchingKeyword("%"+word+"%");
        model.addAttribute("List", list);
        return "search";
    }
    @PostMapping("/search")
    public String searchMarketKeyword(SearchForm keyword){
        System.out.println(keyword.getKeyword());
        keyword.setId(++numId);
        searchr.save(keyword.toEntity());

        return "redirect:/search/"+keyword.getKeyword();
    }
    public List searchingKeyword(String keyword){
        List<Bungae_Market> bungae=br.findByCategoryLike(keyword);
        List<Center_Market> center=cr.findByCategoryLike(keyword);
        List<East_Market> east=er.findByCategoryLike(keyword);
        List<Jaeil_Market> jaeil=jr.findByCategoryLike(keyword);
        List<Pungmul_Market> pungmul=pr.findByCategoryLike(keyword);
        List<South_Market> south=sr.findByCategoryLike(keyword);
        List<West_Market> west=wr.findByCategoryLike(keyword);

        Integer max=00;


        if(bungae.size()>center.size()){
            max= bungae.size();
        }else{
            max= center.size();
        }if(max< east.size()){
            max= east.size();
        }if(max< jaeil.size()){
            max= jaeil.size();
        }if(max< pungmul.size()){
            max= pungmul.size();
        }if(max< south.size()){
            max= south.size();
        }if(max<west.size()) {
            max = west.size();
        }
        List<List> list=new ArrayList<>();
        list.add(bungae);
        list.add(center);
        list.add(east);
        list.add(jaeil);
        list.add(pungmul);
        list.add(south);
        list.add(west);
        for(List ll:list){
            if(ll.size()==max)
                return ll;
        }
        return null;
    }
    @GetMapping("/pungmul")
    public String pungmulMarketIndex(Model model){
        List<Pungmul_Market> marketList=pr.findAll();
        model.addAttribute("pungmul", marketList);
        return "Pungmul";
    }
    @GetMapping("/nambu")
    public String nambuMarektIndex(Model model){
        List<South_Market> marketList=sr.findAll();
        model.addAttribute("Nambu", marketList);
        return "Nambu";
    }
    @GetMapping("/seobu")
    public String seobuMarketIndex(Model model){
        List<West_Market> marketList=wr.findAll();
        model.addAttribute("Seobu", marketList);
        return "Seobu";
    }
    @GetMapping("/dongbu")
    public String dongbuMarketIndex(Model model){
        List<East_Market> marketList=er.findAll();
        model.addAttribute("Dongbu", marketList);
        return "Dongbu";
    }
    @GetMapping("/jonghap")
    public String jaeilMarketIndex(Model model){
        List<Jaeil_Market> marketList=jr.findAll();
        model.addAttribute("jonghap", marketList);
        return "Jonghap";
    }
}
