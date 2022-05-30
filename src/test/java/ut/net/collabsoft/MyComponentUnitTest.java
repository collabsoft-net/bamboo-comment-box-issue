package ut.net.collabsoft;

import org.junit.Test;
import net.collabsoft.api.MyPluginComponent;
import net.collabsoft.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}