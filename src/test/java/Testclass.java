import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Testclass {
   @Test
    void person() {
    String interests[]={"1","2","23","43"};
    person name2 = new person("",22,"",interests);
    Assert.assertArrayEquals(name2.getInterest(),interests);
   }

    @Test
    void array() {
     String interests[]={"being a hardarse", " agile", " ssd hard drives"};
    person person = new person("sam",25,"male",interests);

   Assert.assertEquals(person.hello() ,"Hello, my name is sam and I am 25 years old.My interests are being a hardarse agile ssd hard drives");
    }


}
