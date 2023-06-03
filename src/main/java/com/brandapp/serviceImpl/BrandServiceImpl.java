package com.brandapp.serviceImpl;

import com.brandapp.entity.Brand;
import com.brandapp.payload.BrandDto;
import com.brandapp.repository.BrandRepository;
import com.brandapp.service.BrandService;
import com.fasterxml.jackson.datatype.jdk8.BaseScalarOptionalDeserializer;
import com.sun.rowset.internal.BaseRow;
import org.apache.catalina.authenticator.BasicAuthenticator;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.sql.rowset.BaseRowSet;
import javax.swing.plaf.basic.BasicInternalFrameUI;

@Service
public class BrandServiceImpl implements BrandService {
private BrandRepository brandRepository;
private ModelMapper modelMapper;

    public BrandServiceImpl(BrandRepository brandRepository,ModelMapper modelMapper) {
        this.brandRepository = brandRepository;
        this.modelMapper = modelMapper;
    }



    @Override
    public BrandDto createBrand(BrandDto brandDto) {
        Brand brand = mapToEntity(brandDto);
        Brand newbrand = brandRepository.save(brand);
        BrandDto brandResponse = mapToDto(newbrand);
        return brandResponse;
    }
    private BrandDto mapToDto(Brand newBrand){
        BrandDto brandDto =modelMapper.map(newBrand,BrandDto.class);
        return brandDto;

    }
    private Brand mapToEntity(BrandDto brandDto){
        Brand brand =modelMapper.map(brandDto, Brand.class);
        return brand;
    }


}
