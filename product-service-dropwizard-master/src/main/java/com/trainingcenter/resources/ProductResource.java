package com.trainingcenter.resources;

import com.trainingcenter.api.Product;
import com.trainingcenter.db.ProductDao;
import com.trainingcenter.db.ProductMapper;
import com.trainingcenter.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

    ProductDao productDao;

    public ProductResource(ProductDao productDao) {
        this.productDao = productDao;
    }

    public ProductResource() {

    }


//    @GET
//    public void getProducts() {
//        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
//        try{
//            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
//     productMapper.getAllProducts();
//
//        }finally {
//            sqlSession.close();
//        }
//
//        //List<Product> allProducts = productDao.getAllProducts();
//        //return Response.ok(allProducts).build();
//    }

    @POST
    @Path("/insert")
    public Response createProduct(Product product) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            productMapper.insert(product);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

        productDao.insert(product);
        return Response.status(Response.Status.CREATED).build();
    }


//    @GET
//    @Path("/{id}")

//    public Response getProduct(@PathParam("id") int id) {
//        Product product = productDao.findById(id);
//
//        if (product == null)
//            throw new WebApplicationException("Product does not exist", Response.Status.NOT_FOUND);
//
//        return Response.ok(product).build();
//    }
}
