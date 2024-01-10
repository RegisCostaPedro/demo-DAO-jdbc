package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1,"books");
        Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),2000.0,obj);

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        System.out.println(seller);
    }
}
