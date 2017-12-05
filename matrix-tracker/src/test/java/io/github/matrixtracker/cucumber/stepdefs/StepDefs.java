package io.github.matrixtracker.cucumber.stepdefs;

import io.github.matrixtracker.MatrixtrackerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MatrixtrackerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
