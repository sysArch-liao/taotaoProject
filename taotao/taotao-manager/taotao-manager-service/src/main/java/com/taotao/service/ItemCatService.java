package com.taotao.service;

import com.taotao.common.pojo.EUTreeNode;

import java.util.List;

/**
 * @Auther: Albert
 * @Date: 2019/3/2 17:14
 * @Description:
 */
public interface ItemCatService {
    List<EUTreeNode> getCatList(long parentId);
}
