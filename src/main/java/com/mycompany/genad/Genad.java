/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genad;

import org.junit.runner.Result;
import org.junit.platform.console.ConsoleLauncher;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import test.LoginTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import test.GenerateAdTest;
import test.SignupTest;

/**
 *
 * @author USER
 */

@Suite
@IncludeEngines("junit-jupiter")
@SelectPackages("test")
public class Genad {

    public static void main(String[] args) {
        
        /* Hey! QA mentor, pass the class you want to run a test for here 
           eg.LoginTest.class, SignupTest.class
        */
        
        Result result = JUnitCore.runClasses(GenerateAdTest.class);
        
        
        for (Failure failure : result.getFailures()) {
            System.out.println("Test failed: " + failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully!");
        }
    }
}
