package datastructures.stacksandqueues.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void testEmptyStringInput() {
        assertEquals("Empty string input. No brackets", false, MultiBracketValidation.multiBracketValidation(""));
    }
    @Test
    public void testStringInputWithSpacesOnly() {
        assertEquals("String has only spaces. No brackets", false, MultiBracketValidation.multiBracketValidation("    "));
    }
    @Test
    public void testStringInputWithNoBrackets() {
        assertEquals("String does not contain brackets", false, MultiBracketValidation.multiBracketValidation("12vbgjt"));
    }
    @Test
    public void testStringInputWithBrackets() {
        assertEquals("String has one opening bracket", false, MultiBracketValidation.multiBracketValidation("("));
        assertEquals("String has multiple opening brackets", false, MultiBracketValidation.multiBracketValidation("([{"));
        assertEquals("String has one clogsin bracket only", false, MultiBracketValidation.multiBracketValidation(")"));
        assertEquals("String has only closing brackets", false, MultiBracketValidation.multiBracketValidation("}])"));
        assertEquals("String has mismatching brackets", false, MultiBracketValidation.multiBracketValidation("[}"));
        assertEquals("String has equal number of opening and closing brackets but mismatching", false, MultiBracketValidation.multiBracketValidation("{(})"));
        assertFalse(MultiBracketValidation.multiBracketValidation("(]("));
        assertFalse(MultiBracketValidation.multiBracketValidation("[({}]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{}(){}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("(){}[[]]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
    }
}
