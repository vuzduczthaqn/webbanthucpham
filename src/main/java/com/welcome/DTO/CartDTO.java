package com.welcome.DTO;

import com.welcome.Model.Customer;
import com.welcome.Model.Product;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class CartDTO {
    private Integer quantity;
    private Double payment;
    private int productId;
    private String productName;
    private Double price;
    private String pathImg;
}
