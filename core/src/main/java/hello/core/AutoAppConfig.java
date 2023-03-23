package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //basePackages = "hello.core",
        //basePackageClasses = AutoAppConfig.class,
        //default: hello.core 부터 시작-> 하위 패키지 다 뒤짐
        //패키지 위치 지정하지않고, 설정 정보 클래스의 위치를 프로젝트 최 상단에 두는 것
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = Configuration.class)

)
public class AutoAppConfig {

}

