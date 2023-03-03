package com.trainingcenter.db;

import com.trainingcenter.api.Product;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ProductMapper {

    @SqlUpdate("insert into product (name, description) values (:name, :description)")
    void insert(@BindBean Product product);

    @SqlQuery("select * from product")
    List<Product> getAllProducts();

    @SqlQuery("select * from product where id = :id")
    Product findById(@Bind("id") int id);
}
