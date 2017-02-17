package org.throwable.dao.support;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.MappedStatement;
import org.throwable.entity.User;

/**
 * @author zhangjinci
 * @version 2017/2/16 11:51
 * @function
 */
public class DynamicSqlProviderSupport {


    public String insertUser( MappedStatement ms) {
        System.out.println(ms.toString());
        return new SQL() {
//            {
//                INSERT_INTO("TB_AT_USER");
//                if (user.getName() != null) {
//                    VALUES("NAME", "#{name}");
//                }
//                if (user.getBirth() != null) {
//                    VALUES("BIRTH", "#{birth}");
//                }
//                if (user.getAge() != null) {
//                    VALUES("AGE", "#{age}");
//                }
//                if (user.getEmail() != null) {
//                    VALUES("EMAIL", "#{email}");
//                }
//            }
        }.toString();
    }

    public String dynamicSQL(Object record) {
        return "dynamicSQL";
    }
}
