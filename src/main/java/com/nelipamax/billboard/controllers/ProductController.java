package com.nelipamax.billboard.controllers;

import com.nelipamax.billboard.entities.Product;
import com.nelipamax.billboard.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public String allProducts(Model model) {
        List<Product> products = productService.getProductRepository().findAll();
        model.addAttribute("prod", products);
        return "products";
    }
}
