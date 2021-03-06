package com.xq.live.service.impl;

import com.xq.live.common.Pager;
import com.xq.live.common.RandomStringUtil;
import com.xq.live.dao.SkuMapper;
import com.xq.live.model.Sku;
import com.xq.live.service.SkuService;
import com.xq.live.vo.in.SkuInVo;
import com.xq.live.vo.out.SkuOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-02-09 10:34
 * @copyright:hbxq
 **/
@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    private SkuMapper skuMapper;

    @Override
    public Sku get(Long id) {
        return skuMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pager<SkuOut> list(SkuInVo inVo) {
        Pager<SkuOut> result =  new Pager<SkuOut>();
        int total = skuMapper.listTotal(inVo);
        if(total > 0){
            List<SkuOut> list = skuMapper.list(inVo);
            result.setList(list);
        }
        result.setTotal(total);
        result.setPage(inVo.getPage());
        return result;
    }

    @Override
    public Pager<Sku> queryTscList(SkuInVo inVo){
        Pager<Sku> result =  new Pager<Sku>();
        int total = skuMapper.tscListTotal(inVo);
        if(total > 0){
            List<Sku> list = skuMapper.queryTscList(inVo);
            result.setList(list);
        }
        result.setTotal(total);
        result.setPage(inVo.getPage());
        return result;
    }


    @Override
    public List<SkuOut> top(SkuInVo inVo) {
        return skuMapper.list(inVo);
    }

    @Override
    public Long add(Sku sku) {
        sku.setSkuCode(RandomStringUtil.getRandomCode(8, 0));
        int res = skuMapper.insert(sku);
        if(res < 1){
            return null;
        }
        return sku.getId();
    }

    @Override
    public SkuOut selectById(Long id) {
        return skuMapper.selectById(id);
    }
}
