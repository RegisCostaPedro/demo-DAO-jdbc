package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        System.out.println("=== TEST1: seller findbByID =====");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        Department department = new Department(2,null);
        System.out.println("\n=== TEST2: seller findbByDepartment =====");
        List<Seller> list = sellerDAO.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}
