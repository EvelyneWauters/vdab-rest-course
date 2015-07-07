package be.vdab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Evelyne on 06/07/15.
 */

@SpringBootApplication
public class Main extends WebMvcConfigurerAdapter{

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class);
    }


}
