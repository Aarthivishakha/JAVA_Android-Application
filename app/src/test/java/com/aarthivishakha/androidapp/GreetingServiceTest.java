package com.aarthivishakha.androidapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingServiceTest {
    @Test public void greetsNamedUser() { assertEquals("Hello, Android!", new GreetingService().greet("Android")); }
    @Test public void handlesBlankName() { assertEquals("Hello, Android!", new GreetingService().greet("  ")); }
}
