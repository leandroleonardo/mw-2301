package mysql;

import org.springframework.orm.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.*;
import org.springframework.core.io.*;
import org.springframework.data.repository.init.*;
import java.net.URL;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "mysql-EntityManagerFactory",
        transactionManagerRef = "mysql-TransactionManager"
)
public class MysqlConfiguration {

  @Bean(name="mysql-EntityManagerFactory")
  public LocalEntityManagerFactoryBean entityManagerFactory() {
    LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
    factoryBean.setPersistenceUnitName("mysql");
    return factoryBean;
  }

  @Bean(name = "mysql-TransactionManager")
  public PlatformTransactionManager transactionManager() {
    return new JpaTransactionManager(entityManagerFactory().getObject());
  }

}