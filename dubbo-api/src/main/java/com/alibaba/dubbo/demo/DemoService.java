package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * Created by Becan on 2017/6/30.
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
