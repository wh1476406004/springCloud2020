package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/23 20:41
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return  new RandomRule();
    }
}
