package com.edmart.client.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Measurements implements Serializable {

    private Double length;
    private Double width;
    private Double height;
    private Double weight;
}
