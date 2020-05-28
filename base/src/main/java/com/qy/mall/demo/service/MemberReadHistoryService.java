package com.qy.mall.demo.service;

import com.qy.mall.demo.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

public interface MemberReadHistoryService {

    int create(MemberReadHistory memberReadHistory);

    int delete(List<String> ids);

    List<MemberReadHistory> list (Long memberId);
}
