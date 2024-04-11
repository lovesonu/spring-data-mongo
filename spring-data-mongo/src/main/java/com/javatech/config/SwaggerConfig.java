//package com.javatech.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
////@ComponentScan(basePackages = "com.javatech.*")
//public class SwaggerConfig  implements WebMvcConfigurer {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.javatech.controller")) // Specify the base package of your controllers
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//        @Override
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            registry.addResourceHandler("/swagger-ui.html")
//                    .addResourceLocations("classpath:/META-INF/resources/");
//            registry.addResourceHandler("/webjars/**")
//                    .addResourceLocations("classpath:/META-INF/resources/webjars/");
//        }
////
////    private ApiInfo apiInfo() {
////        return new ApiInfoBuilder().title("MS Deliver API Documentation")
////                .description("This API documentation is related to Deliver Management APIs")
////                .version("2.0.0").build();
////    }
//
//}
