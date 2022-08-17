package cn.begit.design.strategy.controller;

import cn.begit.design.strategy.context.DemoStrategyContext;
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
    private DemoStrategyContext demoStrategyContext;

    @GetMapping("/demo")
    public String demo(String name) {
        DemoStrategyService service = demoStrategyContext.getResource(name);
        return service.helloWorld();
    }
}
