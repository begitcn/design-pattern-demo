package cn.begit.design.strategy.context;

import cn.begit.design.strategy.service.DemoStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 策略接口核心调度工厂
 * <br>
 * 根据 getResource(xxx) 方法传入的xxx调取对应 @Service(xxx) 实现类
 * <br>
 * 具体使用详见controller
 *
 * @author guochao
 * @date 2022-08-17 10:06
 */
@Component
public class DemoStrategyFactory {

    @Autowired
    private Map<String, DemoStrategyService> strategyMap;

    /**
     * 直接获取对应实现类
     */
    public DemoStrategyService getResource(String impl) {
        return strategyMap.get(impl);
    }

    /**
     * 包装处理逻辑
     */
    public String handle(String impl) {
        return "I'm " + strategyMap.get(impl).helloWorld();
    }
}
