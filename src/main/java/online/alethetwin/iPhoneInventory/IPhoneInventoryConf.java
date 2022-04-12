package online.alethetwin.iPhoneInventory;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class IPhoneInventoryConf {
    @Bean
    public XsdSchema iPhoneInventorySchema() {
        return new SimpleXsdSchema(new ClassPathResource("iphone-inventory.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name="iPhoneInventory")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema iPhoneInventorySchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("iphoneInventoryPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("https://alethetwin.online/iPhoneInventory");
        wsdl.setSchema(iPhoneInventorySchema);
        return wsdl;
    }
}
