package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}
	
	@Test
	public void numberOutOfRangeReturnsError() {
		try {
			Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	@Test
	public void randomNumbers() {
		Assert.assertEquals( "ten", numberWords.toWords( 10 ) ) ;
		Assert.assertEquals( "two hundred thirty four", numberWords.toWords( 234 ) ) ;
		Assert.assertEquals( "seventy six thousand three hundred forty nine", numberWords.toWords( 76349 ) ) ;
	}

}
