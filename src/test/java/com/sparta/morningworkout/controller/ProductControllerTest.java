//package com.sparta.morningworkout.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import com.sparta.morningworkout.dto.StatusResponseDto;
//import com.sparta.morningworkout.dto.product.ProductRequestDto;
//import com.sparta.morningworkout.dto.product.ProductResponseDto;
//import com.sparta.morningworkout.dto.product.ProductUpdateRequestDto;
//import com.sparta.morningworkout.entity.CategoryEnum;
//import com.sparta.morningworkout.service.serviceInterface.ProductService;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Mockito.mock;
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = ProductController.class)
//@MockBean(JpaMetamodelMappingContext.class)
//@WithMockUser
//class ProductControllerTest {
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Autowired
//    ObjectMapper objectMapper;
//
//
//    @MockBean
//    ProductService productService;
//
//    @Test
//    @DisplayName("?????? ?????? ?????? ?????? ?????????")
//    void showProductsList() throws Exception {
//
////        List<ProductResponseDto> productResponseDtos = new ArrayList<>();
////        given(productService.showProductList()).willReturn(productResponseDtos);
//
//        mockMvc.perform(get("/products/list")
//                        .contentType(MediaType.APPLICATION_JSON)
////                        .content(objectMapper.writeValueAsBytes(productResponseDtos))
//                        .accept(MediaType.APPLICATION_JSON)
//                        .with(csrf()))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    @DisplayName("?????? ?????? ???????????? ?????????")
//    void addProduct() throws Exception {
//        ProductRequestDto requestDto = new ProductRequestDto("??????1", 20000, CategoryEnum.IT);
//
//        mockMvc.perform(post("/products")
//                        .contentType(MediaType.APPLICATION_JSON )
//                        .content(objectMapper.writeValueAsBytes(requestDto))
//                        .accept(MediaType.APPLICATION_JSON)
//                        .with(csrf()))
//                .andExpect(status().isCreated());
//    }
//
//    @Test
//    @DisplayName("?????? ?????? ?????? ???????????? ?????????")
//    void updateProduct() throws Exception {
//        Long productId = 1L;
//        ProductUpdateRequestDto requestDto = new ProductUpdateRequestDto(20000);
////        String content = new ObjectMapper()
////                .registerModule(new JavaTimeModule())
////                .writeValueAsString(requestDto);
////        given(productService.updateProduct(productId, requestDto)).willReturn("?????? ????????? ????????? ???????????? ???????????????");
//        mockMvc.perform(patch("/products/{productId}",productId)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsBytes(requestDto))
//                        .accept(MediaType.APPLICATION_JSON)
//                        .with(csrf())) // ??????
//                .andExpect(status().isOk()); // ??????
//    }
//
//    @Test
//    @DisplayName("?????? ?????? ???????????? ?????????")
//    void deleteProduct() throws Exception {
//        Long productId = 1L;
//        mockMvc.perform(delete("/products/{productId}", productId))
//                .andExpect(status().isNoContent());
//
//    }
//
//    @Test
//    @DisplayName("????????? ?????? ??????")
//    void showProductBySeller() throws Exception {
//        Long sellerId = 1L;
//        mockMvc.perform(get("/products/list/seller/{sellerId}", sellerId))
//                .andExpect(status().isOk());
//    }
//
//    @Test
////    @DisplayName()
//    void searchByProductsName(){
//
//    }
//
//    @Test
//    void searchBySellerName(){
//
//    }
//}
