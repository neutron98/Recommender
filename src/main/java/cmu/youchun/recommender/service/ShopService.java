package cmu.youchun.recommender.service;

import cmu.youchun.recommender.BusinessException;
import cmu.youchun.recommender.model.ShopModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShopService {

    /**
     * Create a store.
     */
    ShopModel create(ShopModel shopModel) throws BusinessException;

    /**
     * Select one store.
     */
    ShopModel get(Integer id);

    /**
     * Select all stores.
     */
    List<ShopModel> selectAll();

    /**
     * Count all shops.
     */
    Integer countAll();

    /**
     * Recommend
     */
    List<ShopModel> recommend(BigDecimal longitude, BigDecimal latitude);


    /**
     * Search using a keyword, enabling to select orders and filters.
     * @param longitude
     * @param latitude
     * @param keyword
     * @param orderby
     * @param categoryId
     * @param tags
     * @return
     */
    List<ShopModel> search(BigDecimal longitude,BigDecimal latitude,
                           String keyword,Integer orderby,Integer categoryId,String tags);

    /**
     * Search a keyword, group the results by tags.
     * @param keyword
     * @param categoryId
     * @param tags
     * @return
     */
    List<Map<String,Object>> searchGroupByTags(String keyword, Integer categoryId, String tags);
}