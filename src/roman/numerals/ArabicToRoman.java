package roman.numerals;

public class ArabicToRoman {
    private static String [] romanNumerals = {"IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    private static int [] arabicIntegers = {4,5,9,10,40,50,90,100,400,500,900,1000};
    public static String convert(int arabic) {
        StringBuilder sb = new StringBuilder();
        int remainder = arabic;
        for(int i= arabicIntegers.length-1; i >= 0; i--) {
            remainder = appendRomanNumeralReturnRemainder(remainder,arabicIntegers[i],romanNumerals[i], sb);
        }
        for (int i = 1; i <= remainder; i++) {
            sb.append("I");
        }
        return sb.toString();
    }
    
    private static int appendRomanNumeralReturnRemainder(int arabic, int value, String romanNumeral, StringBuilder sb) {
        int remainder = arabic;
        if(arabic >= value) {
            remainder-=value;
            sb.append(romanNumeral);
        } 
        return remainder;
    }

}
