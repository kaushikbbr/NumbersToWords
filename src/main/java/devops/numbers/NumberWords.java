package devops.numbers;

public class NumberWords {
	public static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
	public static final String[] tens = {
            "",        // Null for first element in array
            "",        // Null for second element in array
            "twenty",  // For 20
            "thirty",  // For 30
            "forty",   // For 40
            "fifty",   // For 50
            "sixty",   // For 60
            "seventy", // For 70
            "eighty",  // For 80
            "ninety"   // For 90
    };
	public String toWords( int number ) {
		//String result = "" ;

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        }

        if (number < 1000) {
            return units[number / 100] + " hundred" + ((number % 100 != 0) ? " " : "") + toWords(number % 100);
        }

        if (number < 1000000) {
            return toWords(number / 1000) + " thousand" + ((number % 1000 != 0) ? " " : "") + toWords(number % 1000);
        }

        if (number < 1000000000) {
            return toWords(number / 1000000) + " million" + ((number % 1000000 != 0) ? " " : "") + toWords(number % 1000000);
        }

        return toWords(number / 1000000000) + " billion"  + ((number % 1000000000 != 0) ? " " : "") + toWords(number % 1000000000);
		
		//return result.trim();	
	};

}
