package deqo.mlie.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testCreateEmptyStack() {
        Stack stack = new Stack();

        assertThat(stack.getSize(), is(equalTo(0)));
        assertThat(stack.isEmpty(), is(equalTo(true)));
    }

    @Test
    public void testPush() {
        Stack stack = new Stack();
        Item item = new Item(1);
        Item item2 = new Item(2);

        stack.push(item);

        assertThat(stack.getSize(), is(equalTo(1)));
        assertThat(stack.isEmpty(), is(equalTo(false)));
        assertThat(stack.peek(), is(equalTo(item)));
        assertThat(item.getPrevious(), is(equalTo(null)));

        stack.push(item2);

        assertThat(stack.getSize(), is(equalTo(2)));
        assertThat(stack.isEmpty(), is(equalTo(false)));
        assertThat(stack.peek(), is(equalTo(item2)));
        assertThat(item2.getPrevious(), is(equalTo(item)));
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();
        Item item = new Item(1);
        Item item2 = new Item(2);
        stack.push(item);
        stack.push(item2);

        assertThat(stack.pop(), is(equalTo(item2)));
        assertThat(stack.getSize(), is(equalTo(1)));
        assertThat(stack.isEmpty(), is(equalTo(false)));

        assertThat(stack.pop(), is(equalTo(item)));
        assertThat(stack.getSize(), is(equalTo(0)));
        assertThat(stack.isEmpty(), is(equalTo(true)));
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack() throws EmptyStackException {
        Stack stack = new Stack();

        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekOnEmptyStack() throws EmptyStackException {
        Stack stack = new Stack();

        stack.peek();
    }

}