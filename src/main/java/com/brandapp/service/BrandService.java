package com.brandapp.service;

import com.brandapp.payload.BrandDto;
import com.brandapp.serviceImpl.BrandServiceImpl;

public interface BrandService {
   BrandDto createBrand(BrandDto brandDto);
}
