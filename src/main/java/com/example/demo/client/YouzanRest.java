package com.example.demo.client;

import com.example.demo.vo.CommonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jacky
 * Date: 2019/8/28 15:28
 */
@RestController
public class YouzanRest {

    private final static String TOKEN = "89b4af0b40ed664ece7b367fec755461";
    private final static String URL_SHOP = "https://open.youzanyun.com/api/youzan.shop.get/3.0.0";

    private final RestTemplate restTemplate;

    private final ShopFeignClient shopFeignClient;

    public YouzanRest(RestTemplate restTemplate, ShopFeignClient shopFeignClient) {
        this.restTemplate = restTemplate;
        this.shopFeignClient = shopFeignClient;
    }

    @PostMapping("/getShop")
    public CommonResponse getShop(){
        return restTemplate.postForObject(
                "https://open.youzanyun.com/api/youzan.shop.get/3.0.0?access_token=89b4af0b40ed664ece7b367fec755461",
                null,
                CommonResponse.class);
    }

    @PostMapping("/getShopByFeign")
    public CommonResponse getShopByFeign(@RequestParam String token){
        return shopFeignClient.getShop(token);
    }



}
