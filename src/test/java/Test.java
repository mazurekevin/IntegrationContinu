import org.junit.Assert;
import org.junit.Before;

public class Test {
    public Fonction f = new Fonction();


    @org.junit.Test
    public void isValidTest(){
        Assert.assertEquals(10,f.addition(5,5));
    }

}
