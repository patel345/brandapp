package com.brandapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.util.resources.cldr.en.CalendarData_en_MU;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "brands",uniqueConstraints = {@UniqueConstraint(columnNames ="brandName")})
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
 @Column(nullable = false)
   private String brandName;
 @Column(nullable = false)
   private String brandProduct;
 @Column(nullable = false)
   private String brandSize;
 @Column(nullable = false)
   private String brandPrice;
}
