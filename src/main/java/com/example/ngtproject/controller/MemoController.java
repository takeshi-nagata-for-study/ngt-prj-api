package com.example.ngtproject.controller;

import com.example.ngtproject.controller.request.MemoRequest;
import com.example.ngtproject.model.Memo;
import com.example.ngtproject.service.MemoService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.introspector.PropertyUtils;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @RequestMapping(value = "/api/insertMemo")
    @CrossOrigin(origins = {"*"})
    public boolean insert(
            HttpServletRequest httpServletRequest,
            @RequestBody MemoRequest memoRequest) {

        Memo memo = new Memo();
        BeanUtils.copyProperties(memoRequest, memo);
        memoService.insert(memo);
        return true;
    }

}
