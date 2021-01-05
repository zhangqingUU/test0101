package cn.kgc.test.util;

import com.github.pagehelper.PageInfo;

/**
 * 分页查询相关工具类
 */
public class PageUtils {
    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param
     * @return
     */
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
