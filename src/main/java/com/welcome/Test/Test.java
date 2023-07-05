package com.welcome.Test;

import com.welcome.DAO.ProducerDAO;
import com.welcome.DAO.ProductDAO;
import com.welcome.DAO.ProductTypeDAO;
import com.welcome.DAO.UserDAO;
import com.welcome.Model.*;
import com.welcome.Ultil.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        try (Session session=HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction=session.getTransaction();
            transaction.begin();
//            Position position = new Position();
//            position.setPositionId("p01");
//            position.setPositionName("Khách hàng");
//            session.persist(position);
//
//            User user=new User();
//            user.setPassword("123456");
//            user.setUsername("123thang@gmail.com");
//            user.setPosition(position);
//            user.setFullname("Vux Duc Thang");
//            session.persist(user);
//            Query query = session.createNativeQuery("INSERT INTO [tbl.TaiKhoan] (username, password, fullname, position_id) VALUES (?, ?, ?, ?)");
//            query.setParameter(1, user.getUsername());
//            query.setParameter(2, user.getPassword());
//            query.setParameter(3, user.getFullname());
//            query.setParameter(4, user.getPosition().getPositionId());
//            query.executeUpdate();
//
//            Query query=session.createQuery("from User ");
//            List<User> list=query.getResultList();
//            list.forEach(e-> System.out.println(e.getUsername()));
////            String sql="insert into [tbl.Position](position_id,position_name) values(:newPId,:newPname)";
////            NativeQuery<Position> query=session.createNativeQuery(sql);
////            query.setParameter("newPId","P02");
////            query.setParameter("newPname","admin");
////            query.executeUpdate();
//            User user=new User();
//            user.setUsername("123xxthang@gmail.com");
//            user.setPassword("123456");
//            boolean check=new UserDAO().Login(user);
//
//            System.out.println("complete\t"+check);
//        for(int i=0;i<10;i++) {
//            Producer producer = new Producer();
//            producer.setProducerId("NSX0"+i);
//            producer.setProducerName("Nhà sản xuất "+i);
//            producer.setAddress("Địa chỉ "+i);
//            ProducerDAO producerDAO = new ProducerDAO();
//            producerDAO.insert(producer);
//        }
//        ProductType productType=new ProductType();
////        productType.setTypeId("NRT1");
////        productType.setTypeName("Naruto");
//        ProductTypeDAO productTypeDAO=new ProductTypeDAO();
////        productTypeDAO.insert(productType);
//
//        productType.setTypeId("OP1");
//        productType.setTypeName("One Piece");
//        productTypeDAO.insert(productType);
//            for(int i=1;i<=4;i++){
//                Product product=new Product();
//                Random random=new Random();
//                int price=random.nextInt(99)*10000;
//                product.setProductName("Thuc an nhanh "+i);
//                product.setPathImg("/template/web/ImageProduct/fastFood"+i+".jpg");
//                product.setPrice(Double.parseDouble(price+""));
//                product.setTypeId(new ProductType("FF","Fast food"));
//                product.setProducerId(new Producer("NSX01","Nhà sản xuất 1","Địa chỉ 1"));
//                new ProductDAO().insert(product);
      //     }
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
