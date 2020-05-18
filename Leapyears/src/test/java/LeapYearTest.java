import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    @Test
    public void is_leap_year_2019_false() {
        Assert.assertFalse(new LeapYear(2019).isLeap());
    }

    @Test
    public void is_leap_year_2008_true() {
        Assert.assertTrue(new LeapYear(2008).isLeap());
    }

    @Test
    public void is_leap_year_2016_true() {
        Assert.assertTrue(new LeapYear(2016).isLeap());
    }

    @Test
    public void is_leap_year_1900_true() {
        Assert.assertFalse(new LeapYear(1900).isLeap());
    }

    @Test
    public void is_leap_year_2000_true() {
        Assert.assertTrue(new LeapYear(2000).isLeap());
    }

}
