package org.throwable.dao.support.annotation;

import org.throwable.dao.support.constant.AnnotationConstant;

/**
 * @author zhangjinci
 * @version 2017/2/16 12:17
 * @function
 */
public @interface Table {

    /**
     *表名
     */
    String name() default "";

    /**
     * 命名规则
     */
    AnnotationConstant.NameStyle nameStyle() default AnnotationConstant.NameStyle.CAMELCASE;

}
