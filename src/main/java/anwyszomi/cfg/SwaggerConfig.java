//package anwyszomi.cfg;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableSwagger2
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(metaInfo());
//    }
//
//    private ApiInfo metaInfo() {
//
//        ApiInfo apiInfo = new ApiInfo(
//                "pocket",
//                "pocketApplication",
//                "0.1",
//                "xxx",
//                new Contact("xxx", "xxx", "an@w.pl"),
//                "Licence, privacy policy",
//                "www.com/license"
//        );
//        return apiInfo;
//    }
//}