package com.walmart.automateTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for walmart automation.
 */
public class ExecuteTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ExecuteTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ExecuteTest.class );
    }

    /**
     *  Test
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
