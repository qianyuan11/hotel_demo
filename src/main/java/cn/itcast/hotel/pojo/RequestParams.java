package cn.itcast.hotel.pojo;


import lombok.Data;

@Data
public class RequestParams {
    private String key;
    private Integer page;
    private Integer size;
    private String sortBy;
    //下面时新增搜索条件
    private String city;
    private String brand;
    private String starName;
    private Integer minPrice;
    private Integer maxPrice;
    //添加我的坐标
    private String location;

}
