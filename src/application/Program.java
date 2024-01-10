package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        System.out.println("=== TEST1: seller findById =====");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
    }
}
