package com.mymall.admin.service.serviceImpl;

import com.mymall.admin.service.OmsCompanyAddressService;
import com.mymall.mbg.mapper.OmsCompanyAddressMapper;
import com.mymall.mbg.model.OmsCompanyAddress;
import com.mymall.mbg.model.OmsCompanyAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 *
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;

    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
