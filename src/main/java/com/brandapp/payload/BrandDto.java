package com.brandapp.payload;

import lombok.Data;

@Data
public class BrandDto {
    private long id;
    private String brandName;
    private String brandProduct;
    private String brandSize;
    private String brandPrice;
}
