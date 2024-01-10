package model.DAO;

import model.entities.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Seller obj);
    Seller findById(Integer id);
    List<Seller> findAll();
}