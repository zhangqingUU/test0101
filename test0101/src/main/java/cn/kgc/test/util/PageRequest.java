package cn.kgc.test.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页请求
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequest
{
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
}
