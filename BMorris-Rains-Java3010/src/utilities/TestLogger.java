/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author BenMorrisRains
 */
public class TestLogger {
    
public static void main(String[] args)
	{
		// ----------------------------------------------------------------
		// Test #1 - Test disable/enable logging
		System.out.println("Testing disable/enable logging");
		System.out.println("You should see four messages:");
		Logger_1.setDetailDebug();
		Logger_1.disableLogging();
		Logger_1.logDebug("Test failed, this should not print!");
		Logger_1.logInfo("Test failed, this should not print!");
		Logger_1.logWarning("Test failed, this should not print!");
		Logger_1.logError("Test failed, this should not print!");

		Logger_1.enableLogging();
		Logger_1.logDebug("Message #1");
		Logger_1.logInfo("Message #2");
		Logger_1.logWarning("Message #3");
		Logger_1.logError("Message #4");
		// ----------------------------------------------------------------

		// ----------------------------------------------------------------
		// Test #2 - Test Debug Detail
		System.out.println("Testing Debug Detail");
		System.out.println("You should see four messages:");
		Logger_1.setDetailDebug();
		Logger_1.enableLogging();
		Logger_1.logDebug("Message #1");
		Logger_1.logInfo("Message #2");
		Logger_1.logWarning("Message #3");
		Logger_1.logError("Message #4");
		// ----------------------------------------------------------------

		// ----------------------------------------------------------------
		// Test #3 - Test Info Detail
		System.out.println("Testing Info Detail");
		System.out.println("You should see three messages:");
		Logger_1.setDetailInfo();
		Logger_1.enableLogging();
		Logger_1.logDebug("Test failed, this should not print!");
		Logger_1.logInfo("Message #1");
		Logger_1.logWarning("Message #2");
		Logger_1.logError("Message #3");
		// ----------------------------------------------------------------

		// ----------------------------------------------------------------
		// Test #4 - Test Warning Detail
		System.out.println("Testing Warning Detail");
		System.out.println("You should see two messages:");
		Logger_1.setDetailWarning();
		Logger_1.enableLogging();
		Logger_1.logDebug("Test failed, this should not print!");
		Logger_1.logInfo("Test failed, this should not print!");
		Logger_1.logWarning("Message #1");
		Logger_1.logError("Message #2");
		// ----------------------------------------------------------------

		// ----------------------------------------------------------------
		// Test #5 - Test Error Detail
		System.out.println("Testing Error Detail");
		System.out.println("You should see one messages:");
		Logger_1.setDetailError();
		Logger_1.enableLogging();
		Logger_1.logDebug("Test failed, this should not print!");
		Logger_1.logInfo("Test failed, this should not print!");
		Logger_1.logWarning("Test failed, this should not print!");
		Logger_1.logError("Message #1");
		// ----------------------------------------------------------------

	}

	
}
