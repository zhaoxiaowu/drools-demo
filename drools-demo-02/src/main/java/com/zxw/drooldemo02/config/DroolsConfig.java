package com.zxw.drooldemo02.config;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wuhongyun
 * @date: 2021/1/31
 */
@Configuration
public class DroolsConfig {
    @Bean
    public KieContainer kieContainer(){
        KieServices kieServices = KieServices.Factory.get();
        return kieServices.getKieClasspathContainer();
    }
}
