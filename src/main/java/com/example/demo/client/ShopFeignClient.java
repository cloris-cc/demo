package com.example.demo.client;

import com.example.demo.vo.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Jacky
 * Date: 2019/8/28 16:08
 */
@FeignClient(name = "test",url = "https://open.youzanyun.com/api")
public interface ShopFeignClient {

//    @PostMapping("/youzan.shop.get/3.0.0?access_token=89b4af0b40ed664ece7b367fec755461")

    @PostMapping("/youzan.shop.get/3.0.0")
    CommonResponse getShop(@RequestParam(name = "access_token") String token);
}