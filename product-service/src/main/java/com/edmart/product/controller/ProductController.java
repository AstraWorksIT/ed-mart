package com.edmart.product.controller;

import com.edmart.product.dto.ProductDTO;
import com.edmart.product.dto.ProductResponseDTO;
import com.edmart.product.exception.ProductNotFoundException;
import com.edmart.product.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin
@AllArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<ProductResponseDTO> getAllProducts(@RequestParam(defaultValue = "0") int page,
                                                               @RequestParam(defaultValue = "5") int size,
                                                               @RequestParam(value = "sortBy", defaultValue = "createdAt", required = false) String sortBy,
                                                               @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir){
        log.info("Retrieving all products: {}", productService.getAllProducts(page, size,sortBy, sortDir));

        return ResponseEntity.ok().body(productService.getAllProducts(page, size,sortBy, sortDir));
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductDTO productDTO) throws ProductNotFoundException {
        log.info("Creating a product with name: {}",productDTO.name());

        productService.createProduct(productDTO);

        return ResponseEntity.ok().body("Product created successfully");
    }

    @GetMapping("/{Id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("Id") Long Id) throws ProductNotFoundException {
        log.info("Retrieving a product with Id: {}", Id);

        return ResponseEntity.ok().body(productService.getProduct(Id));
    }

    @PutMapping("/{productId}")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO request, @PathVariable Long productId) throws ProductNotFoundException {
        log.info("Updating a product with name:{}",request.name());

        productService.updateProduct(productId, request);

        log.info("Updated Product Successfully {}", request);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable("productId") Long productId) throws ProductNotFoundException {
        productService.deleteProduct(productId);

        log.info("Successfully deleted product with Id {}", productId);

        return ResponseEntity.ok("Product deleted successfully!");
    }
}
