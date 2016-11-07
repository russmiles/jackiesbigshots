package com.myorg;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "<https://sylvainslaptop>", fallback = HollywoodFallback.class)
interface Hollywood {
    @RequestMapping(value = "/movies", method = GET)
    String getMyMovie();
}

class HollywoodFallback implements Hollywood {
    @Override
    public String getMyMovie() {
        return null;
    }
}
