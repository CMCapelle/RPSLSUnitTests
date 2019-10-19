package edu.cscc;

//Corey Capelle , 10/18/2019, CSCI-2467 Lab 7 – JavaDoc, Unit Testing, and GitHub

import org.junit.Assert;
import org.junit.Test;

public class RPSLSpock_Test {


    @Test
    public void testIsValidPick() {

        RPSLSpock testPick = new RPSLSpock();

        Assert.assertTrue(testPick.isValidPick("rock")); //these tests will pass
        Assert.assertTrue(testPick.isValidPick("paper")); // ""
        Assert.assertTrue(testPick.isValidPick("scissors")); // ""
        Assert.assertTrue(testPick.isValidPick("lizard")); // ""
        Assert.assertTrue(testPick.isValidPick("spock")); // ""
        Assert.assertTrue(testPick.isValidPick("pterodactyl")); //this test will fail

    }

    @Test

    public void testgeneratePick() {

        String thePick;

        for (int i = 0; i < 999999; i++) {

            RPSLSpock testGenerate = new RPSLSpock();

            thePick = testGenerate.generatePick();

            testGenerate.isValidPick(thePick);

            Assert.assertNotNull(thePick);



            //I was originally using the below code, but was struggling to get a value that worked until I created
            //the variable "thePick" to keep track of what I was doing.  Not sure if this was best practice
            //but it seems to work for me. Please let me know.

            //testGenerate.isValidPick(testGenerate.generatePick());

            //Assert.assertNotNull(testGenerate.generatePick());

        }

    }

    @Test
    public void testisComputerWin() {

        RPSLSpock testWin = new RPSLSpock();

        Assert.assertTrue(testWin.isComputerWin("rock","scissors")); //these tests pass
        Assert.assertTrue(testWin.isComputerWin("rock","lizard"));
        Assert.assertTrue(testWin.isComputerWin("paper","rock"));
        Assert.assertTrue(testWin.isComputerWin("paper","spock"));
        Assert.assertTrue(testWin.isComputerWin("scissors","paper"));
        Assert.assertTrue(testWin.isComputerWin("scissors","lizard"));
        Assert.assertTrue(testWin.isComputerWin("lizard","paper"));
        Assert.assertTrue(testWin.isComputerWin("lizard","spock"));
        Assert.assertTrue(testWin.isComputerWin("spock","rock"));
        Assert.assertTrue(testWin.isComputerWin("spock","scissors"));// these tests pass
        Assert.assertTrue(testWin.isComputerWin("scissors","rock")); //this test fails



    }
}




