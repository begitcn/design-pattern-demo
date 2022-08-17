package cn.begit.design.strategy.service.impl;

import cn.begit.design.strategy.service.DemoStrategyService;
import org.springframework.stereotype.Service;

/**
 * Jerry实现类
 *
 * @author guochao
 * @date 2022-08-17 10:03
 */
@Service("jerry")
public class JerryDemoStrategyServiceImpl implements DemoStrategyService {
    @Override
    public String helloWorld() {
        return "I'm Jerry";
    }
}
