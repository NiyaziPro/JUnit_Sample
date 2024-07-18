package day01_sample;

import junit.framework.TestCase;

import java.util.Queue;

public class RandomListQueueTest extends TestCase {
    private static final String VALUE_A = "A";
    private static final String VALUE_B = "B";
    private static final String VALUE_C = "C";
    private Queue queue;

    protected void setUp() throws Exception{
        super.setUp();
       queue =  new RandomListQueue();
    }
    protected  void tearDown() throws Exception{
        super.tearDown();
        queue = null;
    }
    public void testAccessAnEmptyQueue() {
        assertEquals(0, queue.size());
        assertEquals(queue.isEmpty());
    }

    private void assertEquals(boolean empty) {
    }
}



