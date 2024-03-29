package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/** 商品（包含类目）
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/28 15:50
 */
@Data
public class ProductVO implements Serializable{

    private static final long serialVersionUID = -3555231358992190972L;

    @JsonProperty("name")    //@JsonProperty 序列化返回给前端指定的json的key
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
