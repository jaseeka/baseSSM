package com.basessm.service;

import com.basessm.common.Page;
import com.basessm.common.ResultEntity;
import com.basessm.entity.Entity;

/**
 * Created by jaseeka
 * Date 2015/8/6
 * Time 16:39
 */
public interface IEntityService {

    /**
     * 根据条件获取测试类
     * @param entity
     * @param page
     * @return
     */
    public ResultEntity getEntityList(Entity entity, Page page);
}
