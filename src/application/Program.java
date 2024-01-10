package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        System.out.println("=== TEST1: seller findByID =====");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        Department department = new Department(2,null);
        System.out.println("\n=== TEST2: seller findByDepartment =====");
        List<Seller> list = sellerDAO.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }


        System.out.println("\n=== TEST3: seller findAll =====");
        list = sellerDAO.findAll();

        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST4: seller insert =====");
        Seller newseller = new Seller(null,"Gred","greg@gmail.com",new Date(),4000.0,department);
        sellerDAO.insert(newseller);
        System.out.println("Inserted! New Id = " + newseller.getId());


        System.out.println("\n=== TEST5: seller update =====");
        seller = sellerDAO.findById(1);
        seller.setName("Marta Waine");
        sellerDAO.update(seller);
        System.out.println("Update completed");


        System.out.println("\n=== TEST6: seller delete =====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();


        sellerDAO.deleteById(id);
        System.out.println("Delete completed.");


        sc.close();
    }
}
