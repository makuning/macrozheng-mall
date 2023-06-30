package cn.insectmk.macrozhengmall.service;

import cn.insectmk.macrozhengmall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Description 品牌服务接口
 * @Author makun
 * @Date 2023/6/30 17:27
 * @Version 1.0
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}


