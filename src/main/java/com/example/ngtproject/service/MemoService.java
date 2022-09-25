package com.example.ngtproject.service;

import com.example.ngtproject.mapper.MemoMapper;
import com.example.ngtproject.model.Memo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoMapper memoMapper;

    @Transactional
    public Memo insert(Memo memo){
        memoMapper.insert(memo);
        return memo;
    }

}
