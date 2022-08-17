package cn.begit.design.strategy.service.impl;

import cn.begit.design.strategy.service.DemoStrategyService;
import org.springframework.stereotype.Service;

/**
 * Tom实现类
 *
 * @author guochao
 * @date 2022-08-17 10:02
 */
@Service("tom")
public class TomDemoStrategyServiceImpl implements DemoStrategyService {
    @Override
    public String helloWorld() {
        return "I'm Tom";
    }
}
