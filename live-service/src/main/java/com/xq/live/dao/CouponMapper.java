package com.xq.live.dao;

import com.xq.live.model.Coupon;
import com.xq.live.vo.in.CouponInVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 券信息Dao
 */
@Repository
public interface CouponMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Coupon record);

    Coupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);

    List<Coupon> list(CouponInVo inVo);

    int listTotal(CouponInVo inVo);

    /**
     * 使用抵用券
     * @param record
     * @return
     */
    int useCoupon(Coupon record);

    Coupon getByCouponCode(String couponCode);

}