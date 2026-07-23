package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

public class MyServiceTest {
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService s = new MyService(mockApi);
        s.execute("Hello");
        verify(mockApi).processData("Hello");
    }
}
