package com.mymall.auth.service;

import com.mymall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("mall-portal")
public interface UmsMemberService {
    @GetMapping("/sso/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
