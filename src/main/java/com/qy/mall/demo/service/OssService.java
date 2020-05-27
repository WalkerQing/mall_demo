package com.qy.mall.demo.service;

import com.qy.mall.demo.dto.OssCallbackResult;
import com.qy.mall.demo.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
