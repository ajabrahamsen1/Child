package tests;

// AJ Abrahamsen

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestChild1.class, TestChild2.class })
public class AllTests {

}
