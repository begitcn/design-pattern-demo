package cn.begit.design.strategy.context;

import cn.begit.design.strategy.service.DemoStrategyService;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略接口核心调度类
 * <br>
 * 根据 getResource(xxx) 方法传入的xxx调取对应 @Service(xxx) 实现类
 * <br>
 * 具体使用详见controller
 *
 * @author guochao
 * @date 2022-08-17 10:06
 */
@Component
public class DemoStrategyContext {
    private final Map<String, DemoStrategyService> strategyMap = new ConcurrentHashMap<>();

    public DemoStrategyContext(Map<String, DemoStrategyService> strategyMap) {
        this.strategyMap.clear();
        strategyMap.forEach((k, v) -> this.strategyMap.put(k, v));
    }

    public DemoStrategyService getResource(String impl) {
        return strategyMap.get(impl);
    }
}
