package com.kevin.policy.demo.handler;

import org.springframework.stereotype.Component;

/**
 * @author kevin
 */
@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {
    @Override
    public String handler(TestDTO dto) {
        return "deal normal handler";
    }
}
