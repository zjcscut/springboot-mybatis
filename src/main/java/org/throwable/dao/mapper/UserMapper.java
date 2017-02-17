package org.throwable.dao.mapper;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.throwable.dao.support.DynamicSqlProviderSupport;
import org.throwable.entity.User;

/**
 * @author zhangjinci
 * @version 2017/2/16 11:38
 * @function
 */
@Mapper
public interface UserMapper {

    @InsertProvider(type = DynamicSqlProviderSupport.class,method = "dynamicSQL")
    @Options(useGeneratedKeys = true)
    int insertUser(User user);
}
