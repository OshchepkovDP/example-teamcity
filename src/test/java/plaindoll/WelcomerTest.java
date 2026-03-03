package plaindoll;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class WelcomerTest {

    private Welcomer welcomer = new Welcomer();

    @Test
    public void testGetHunterReplyContainsHunter() {
        String reply = welcomer.getHunterReply();
        assertNotNull("Reply should not be null", reply);
        assertTrue("Reply should contain 'hunter'", reply.toLowerCase().contains("hunter"));
    }

    @Test
    public void welcomerSaysWelcome() {
        assertThat(welcomer.sayWelcome(), containsString("Welcome"));
    }

    @Test
    public void welcomerSaysFarewell() {
        assertThat(welcomer.sayFarewell(), containsString("Farewell"));
    }

    @Test
    public void sayWelcomeAndFarewellContainHunter() {
        assertThat(welcomer.sayWelcome(), containsString("hunter"));
        assertThat(welcomer.sayFarewell(), containsString("hunter"));
    }

    @Test
    public void welcomerSaysSilver() {
        assertThat(welcomer.sayNeedGold(), containsString("gold"));
    }

    @Test
    public void welcomerSaysSomething() {
        assertThat(welcomer.saySome(), containsString("something"));
    }
}
