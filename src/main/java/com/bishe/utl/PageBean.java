package com.bishe.utl;

import lombok.Data;

/**
 * 自定义分页工具类
 */
public class PageBean {
    private Integer currentPage;
    private Integer startIndex;
    private Integer pageSize=5;
    private Integer totalCount;
    private Integer prv,next;
    private Integer totalPage;

    public Integer getPrv() {
        return prv;
    }

    public void setPrv(Integer prv) {
        this.prv = prv;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        this.startIndex = (this.currentPage-1)*this.pageSize ;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        this.totalPage = (int)Math.ceil((this.totalCount*1.0/this.pageSize));
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }
}

