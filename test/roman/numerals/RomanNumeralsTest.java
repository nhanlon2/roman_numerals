package roman.numerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {

    @Test
    public void shouldReturnRomanNUmeralForOne() {
        assertEquals("I", ArabicToRoman.convert(1));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForTwo() {
        assertEquals("II", ArabicToRoman.convert(2));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForThree() {
        assertEquals("III", ArabicToRoman.convert(3));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForFour() {
        assertEquals("IV", ArabicToRoman.convert(4));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForFive() {
        assertEquals("V", ArabicToRoman.convert(5));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForSix() {
        assertEquals("VI", ArabicToRoman.convert(6));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForSeven() {
        assertEquals("VII", ArabicToRoman.convert(7));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForEight() {
        assertEquals("VIII", ArabicToRoman.convert(8));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForNine() {
        assertEquals("IX", ArabicToRoman.convert(9));
    }
    
    @Test
    public void shouldReturnRomanNUmeralForTen() {
        assertEquals("X", ArabicToRoman.convert(10));
    }
    @Test
    public void shouldReturnRomanNUmeralForEighteen() {
        assertEquals("XVIII", ArabicToRoman.convert(18));
    }
}
