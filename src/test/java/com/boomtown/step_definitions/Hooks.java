package com.boomtown.step_definitions;

import io.cucumber.java.Before;

public class Hooks {
    @Before(value = "@login")
    public void setUpLoginScenario() {

    }
}
