package cn.begit.design.strategy.controller;

import cn.begit.design.strategy.context.DemoStrategyFactory;
import cn.begit.design.strategy.service.DemoStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试策略模式
 *
 * @author guochao
 * @date 2022-08-17 10:05
 */
@RestController
@RequestMapping("/strategy")
public class DemoController {

    @Autowired
    private DemoStrategyFactory strategyFactory;

    @GetMapping("/demo")
    public String demo(String name) {
        DemoStrategyService service = strategyFactory.getResource(name);
        return service.helloWorld();
    }

    @GetMapping("/handle")
    public String handle(String name) {
        return strategyFactory.handle(name);
    }
}
