package pyc.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author pi
 * @date 20/12/22 15:33:20
 */
public class QueueUsingLinkTableTest {
    @Test
    public void should_return_1_when_enqueue_1_item() throws Exception {
        QueueUsingLinkTable queueUsingLinkTable = new QueueUsingLinkTable();
        queueUsingLinkTable.enqueue("hollow");
        assertThat(queueUsingLinkTable.size(), is(1));
    }

    @Test
    public void should_dequeue_hello_when_enqueue_hello() throws Exception {
        QueueUsingLinkTable<String> stringQueueUsingLinkTable = new QueueUsingLinkTable<>();
        stringQueueUsingLinkTable.enqueue("hello");
        stringQueueUsingLinkTable.enqueue("world");
        assertThat(stringQueueUsingLinkTable.dequeue(), is("hello"));
    }

    @Test
    public void should_return_false_if_queue_is_not_empty() throws Exception {
        QueueUsingLinkTable<Long> longQueueUsingLinkTable = new QueueUsingLinkTable<>();
        longQueueUsingLinkTable.enqueue(111L);
        assertThat(longQueueUsingLinkTable.isEmpty(), is(false));
    }
}
