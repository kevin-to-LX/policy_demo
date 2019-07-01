package com.kevin.policy.demo.handler;

import org.springframework.stereotype.Component;

/**
 * @author kevin
 */
@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler{
    @Override
    public String handler(TestDTO dto) {
        return "deal group handler";
    }
}
