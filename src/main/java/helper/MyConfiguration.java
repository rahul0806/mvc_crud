package helper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

@Configuration
@ComponentScan({"controller","services","dao"})
public class MyConfiguration {

@Bean
ViewResolver resolver()
{
	InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	resolver.setPrefix("jsp/");
	resolver.setSuffix(".jsp");
	return resolver;
}

@Bean
public EntityManager manager()
{
	return Persistence.createEntityManagerFactory("dev").createEntityManager();
}

}
