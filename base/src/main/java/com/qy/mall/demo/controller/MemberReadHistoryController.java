package com.qy.mall.demo.controller;

import com.qy.mall.demo.common.CommonResult;
import com.qy.mall.demo.nosql.mongodb.document.MemberReadHistory;
import com.qy.mall.demo.service.MemberReadHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags="MemberReadHistoryController")
@RequestMapping("member/readHistory")
public class MemberReadHistoryController {
    @Autowired
    private MemberReadHistoryService memberReadHistoryService;

    @ApiOperation("创建浏览记录")
    @PostMapping("/create")
    public CommonResult create(@RequestBody MemberReadHistory history){
        int count = memberReadHistoryService.create(history);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed();
    }

    @ApiOperation("删除浏览记录")
    @PostMapping("/delete")
    public CommonResult delete(@RequestParam("ids") List<String> ids){
        int count = memberReadHistoryService.delete(ids);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed();
    }

    @ApiOperation("展示浏览记录")
    @PostMapping("/list")
    public CommonResult<List<MemberReadHistory>> list(Long memberId){
        List<MemberReadHistory> memberReadHistories = memberReadHistoryService.list(memberId);
        return CommonResult.success(memberReadHistories);
    }
}
