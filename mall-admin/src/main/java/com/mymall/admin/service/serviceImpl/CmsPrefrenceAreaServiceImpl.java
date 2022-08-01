package com.mymall.admin.service.serviceImpl;

import com.mymall.mbg.mapper.CmsPrefrenceAreaMapper;
import com.mymall.mbg.model.CmsPrefrenceArea;
import com.mymall.mbg.model.CmsPrefrenceAreaExample;
import com.mymall.admin.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选管理Service实现类
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
