package fr.uvsq.tod.wordanalyser;
import org.junit.Test;
import static org.junit.Assert.fail;

public class WordAnalyzerTest {
  @Test
  public void shouldTest()
  {
    fail("Not yet implemented.");
  }

  @Test
  public void expectedCharacter(char expectedChar, String s)
  {
     if(s.firstRepeatedCharacter!='0')
     {
        assertEquals(expectedChar, s.firstRepeatedCharacter());
     }
     
     assertEquals('0', s.firstRepeatedCharacter());
  }
}
