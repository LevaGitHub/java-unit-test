@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
        {21, true},
        {19, true},
        {18, true},
        {17, false}
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	int testAge = age;
    boolean isAdult = program.checkIsAdult(testAge);
    assertEquals("", result, isAdult);
	}
}

