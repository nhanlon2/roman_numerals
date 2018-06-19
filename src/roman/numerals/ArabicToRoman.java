package roman.numerals;

public class ArabicToRoman {
    private static String [] romanNumerals = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    private static int [] arabicIntegers = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    public static String convert(int arabic) {
        StringBuilder sb = new StringBuilder();
        int remainder = arabic;
        for(int i= arabicIntegers.length-1; i >= 0; i--) {
            remainder = appendRomanNumeralReturnRemainder(remainder,arabicIntegers[i],romanNumerals[i], sb);
        }
        return sb.toString();
    }
    
    private static int appendRomanNumeralReturnRemainder(int arabic, int value, String romanNumeral, StringBuilder sb) {
        int remainder = arabic;
        while(remainder >= value) {
            remainder-=value;
            sb.append(romanNumeral);
        } 
        return remainder;
    }

}
