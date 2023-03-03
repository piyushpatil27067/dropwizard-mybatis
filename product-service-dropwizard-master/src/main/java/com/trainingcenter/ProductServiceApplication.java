package com.trainingcenter;

import com.loginbox.dropwizard.mybatis.MybatisBundle;
import com.trainingcenter.db.ProductDao;
import com.trainingcenter.db.ProductMapper;
import com.trainingcenter.resources.ProductResource;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.jdbi.v3.core.Jdbi;

public class ProductServiceApplication extends Application<ProductServiceConfiguration> {


    private final MybatisBundle<ProductServiceConfiguration> mybatisBundle
            = new MybatisBundle<ProductServiceConfiguration>(ProductMapper.class) {
        @Override
        public DataSourceFactory getDataSourceFactory(ProductServiceConfiguration configuration) {
            return configuration.getDataSourceFactory();
        }
    };


    public static void main(final String[] args) throws Exception {
        new ProductServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "ProductService";
    }

    @Override
    public void initialize(final Bootstrap<ProductServiceConfiguration> bootstrap) {
        bootstrap.addBundle(mybatisBundle);
    }

    @Override
    public void run(final ProductServiceConfiguration configuration,
                    final Environment environment) {

//        final JdbiFactory factory = new JdbiFactory();
//        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "h2");
//        ProductDao productDao = jdbi.onDemand(ProductDao.class);

        //Resources
       // ProductDao productDao = null;
       // ProductResource productResource = new ProductResource();
        //environment.jersey().register(ProductResource);

//        SqlSessionFactory sessionFactory = mybatisBundle.getSqlSessionFactory();
//        environment.jersey().register(new ProductResource(sessionFactory));

//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(this.getClass().getResourceAsStream("mybatis-config.xml"));
//        //mybatisBundle.setSqlSessionFactory(sqlSessionFactory);
//        environment.jersey().register(sqlSessionFactory);
        environment.jersey().register(new ProductResource());
    }
}
