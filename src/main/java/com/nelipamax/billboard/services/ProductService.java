package com.nelipamax.billboard.services;


import com.nelipamax.billboard.repositories.ProductRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
}

