package com.qy.mall.demo.nosql.mongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class MemberReadHistory {
    @Id
    private String id;
    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    @Indexed
    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;

    public String getId() {
        return id;
    }

    public MemberReadHistory setId(String id) {
        this.id = id;
        return this;
    }

    public Long getMemberId() {
        return memberId;
    }

    public MemberReadHistory setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public MemberReadHistory setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
        return this;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public MemberReadHistory setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public MemberReadHistory setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public MemberReadHistory setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductPic() {
        return productPic;
    }

    public MemberReadHistory setProductPic(String productPic) {
        this.productPic = productPic;
        return this;
    }

    public String getProductSubTitle() {
        return productSubTitle;
    }

    public MemberReadHistory setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
        return this;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public MemberReadHistory setProductPrice(String productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public MemberReadHistory setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
