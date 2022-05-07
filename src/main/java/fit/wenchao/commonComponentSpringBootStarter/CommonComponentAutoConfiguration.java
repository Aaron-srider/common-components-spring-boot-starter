package fit.wenchao.commonComponentSpringBootStarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ApplicationContextHolder.class)
public class CommonComponentAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    ApplicationContextHolder applicationContextHolder (){
        return new ApplicationContextHolder();
    }

}