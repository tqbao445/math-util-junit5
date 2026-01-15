
package com.mycompany.mathutil.core;

import static com.mycompany.mathutil.core.MathUtil.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class MathUtilTest {
    
   public static Object[][] intitData() {
       return new Integer[][] {
               {1, 1},
               {2, 2},
               {5, 120},
               {6, 720}         
       };
   }
    
    
   @ParameterizedTest
   @MethodSource(value = "intitData")
   public void testGetFactorialGivenRightArrgReturnWell(int input, int expected) {
       assertEquals(expected, getFactorial(input));
   }
     
    @Test
   public void testGetFactorialGivenWrongArrgReturnWell() {
       assertThrows(IllegalArgumentException.class, () -> {
           getFactorial(-100);
       });
   }
    
}

