package com.apollo.springtest.dao;

import com.apollo.springtest.domain.annotation.FirstLevelRepository;
import com.apollo.springtest.domain.annotation.SecondLevelRepository;

/**
 * @ClassName MyFirstLevelRepository
 * @Description
 * @Author wangxin10
 * @Date 2022-12-30 14:44
 */
@SecondLevelRepository("mySecondLevelRepository")
public class MySecondLevelRepository {
}
