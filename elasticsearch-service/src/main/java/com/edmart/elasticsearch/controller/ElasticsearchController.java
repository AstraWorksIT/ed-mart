package com.edmart.elasticsearch.controller;

import com.edmart.client.product.ProductDTO;
import com.edmart.elasticsearch.model.Product;
import com.edmart.elasticsearch.service.ElasticSearchServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/search/products")
public class ElasticsearchController {

    private final ElasticSearchServiceImpl elasticSearchService;

    @GetMapping
    public Iterable<Product> getAllProductIndexes(){
        return elasticSearchService.getAllProductIndexes();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Optional<Product>> getProductByProductId(@PathVariable("productId") Long productId){

        return ResponseEntity.ok().body(elasticSearchService.getProductByProductId(productId));
    }
}
