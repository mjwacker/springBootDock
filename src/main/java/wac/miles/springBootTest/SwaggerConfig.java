package wac.miles.springBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.ApiInfo;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    Environment environment;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Spring Boot test REST API")
                .description("Spring Boot provides a powerful RESTful implemenation.")
                .version(environment.getProperty("version"))
                .contact(new Contact("Miles Wacker", "https://www.linkedin.com/in/miles-wacker-68941282/", "mileswacker@yahoo.com")).build();

    }


}
