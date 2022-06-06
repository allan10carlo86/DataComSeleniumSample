package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import TestCases.TESTCASE1_PayeesValidation;
import TestCases.TESTCASE2_AddNewPayee;
import TestCases.TESTCASE3_ValidatePayeeNameIsARequiredField;
import TestCases.TESTCASE4_ValidateSorting;
import TestCases.TESTCASE5_Payments;		

@RunWith(Suite.class)				
@Suite.SuiteClasses({				
  TESTCASE1_PayeesValidation.class,
  TESTCASE2_AddNewPayee.class,
  TESTCASE3_ValidatePayeeNameIsARequiredField.class,
  TESTCASE4_ValidateSorting.class,
  TESTCASE5_Payments.class
})


public class TestSuite1{
	
}