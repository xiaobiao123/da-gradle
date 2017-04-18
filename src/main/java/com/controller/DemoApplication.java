//package com.controller;
//
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.catalina.connector.Connector;
//import org.apache.coyote.http11.Http11NioProtocol;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.Banner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
//import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
//import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
//import org.springframework.boot.web.servlet.ErrorPage;
//import org.springframework.boot.web.servlet.MultipartConfigFactory;
//import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.scheduling.annotation.EnableAsync;
//
//import javax.servlet.MultipartConfigElement;
//
////@SpringBootApplication 等同于默认的属性的 @Configuration, @EnableAutoConfiguration and @ComponentScan。
//@EnableAutoConfiguration
//@SpringBootApplication
//@ComponentScan
//@ServletComponentScan
//@EnableAsync
//
////@EnableRedisHttpSession
//public class DemoApplication {
//
//    private static Logger log = LoggerFactory.getLogger(DemoApplication.class);
//
//    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(DemoApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
////        SpringApplication.run(Application.class, args);
//
////        /*spring boot启动开始时执行的事件*/
////        app.addListeners(new MyApplicationStartedEventListener());
////        /*spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建。*/
////        app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
////        /*上下文创建完成后执行的事件监听器*/
////        app.addListeners(new MyApplicationPreparedEventListener());
////        /*spring boot启动异常时执行事件*/
////        app.addListeners(new MyApplicationFailedEventListener());
//
////        app.setAdditionalProfiles();
//        app.run(args);
//        log.trace("======trace");
//        log.debug("======debug");
//        log.info("======info");
//        log.warn("======warn");
//        log.error("======error");
//        log.info("运行成功");
//    }
//
//    /**
//     * 文件上传大小限制
//     *
//     * @return
//     */
//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        //// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
//        factory.setMaxFileSize("128KB"); //KB,MB
//        /// 设置总上传数据总大小
//        factory.setMaxRequestSize("256KB");
//        //Sets the directory location where files will be stored.
//        //factory.setLocation("路径地址");
//        return factory.createMultipartConfig();
//    }
//
//
//    /**
//     * 自定义错误处理
//     *
//     * @return
//     */
////    @Bean
//    public EmbeddedServletContainerCustomizer containerCustomizer() {
//        return new EmbeddedServletContainerCustomizer() {
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//
//                TomcatEmbeddedServletContainerFactory tomcatFactory = (TomcatEmbeddedServletContainerFactory) container;
//                tomcatFactory.addConnectorCustomizers(new TomcatConnectorCustomizer() {
//
//                    @Override
//                    public void customize(Connector connector) {
//                        Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
//                        // 设置最大连接数
//                        protocol.setMaxConnections(2000);
//                        // 设置最大线程数
//                        protocol.setMaxThreads(2000);
//                        protocol.setConnectionTimeout(30000);
//                    }
//
//                });
//
//                container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error/404"));
//                container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500"));
//                container.addErrorPages(new ErrorPage(Throwable.class, "/error/500"));
//            }
//        };
//    }
//
//
//    /**
//     * 指定使用 jackson 解析
//     *
//     * @return
//     */
//    // @Bean
//    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
//        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        jsonConverter.setObjectMapper(objectMapper);
//        return jsonConverter;
//    }
//
//
//    /**
//     * fastjson
//     * @return
//     */
////    @Bean
////    public HttpMessageConverters fastJsonHttpMessageConverters() {
////        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
////        FastJsonConfig fastJsonConfig = new FastJsonConfig();
////        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
////        fastConverter.setFastJsonConfig(fastJsonConfig);
////        HttpMessageConverter<?> converter = fastConverter;
////        return new HttpMessageConverters(converter);
////    }
//
//
//}
