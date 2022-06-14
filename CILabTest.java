import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }
    //Task 1: For null String the detectCapitalUse method will throw NullPointerException
    @Test
    public void detectCapitalUseTest1() {
    	assertThrows(NullPointerException.class, () -> {
    		myString.detectCapitalUse();
        });

    }
    /*
     *	Task 2: if the usage of capitals in it is not right, the detectCapitalUse method will return false
     */
    @Test
    public void detectCapitalUseTest2() {
    	myString.setString("USa");
    	boolean stringCheck = myString.detectCapitalUse();
    	
        assertEquals(false ,stringCheck);
    }


}
