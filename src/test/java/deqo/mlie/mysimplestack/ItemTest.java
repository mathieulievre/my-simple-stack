package deqo.mlie.mysimplestack;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testCreateItem() {
        Item item = new Item(1);

        assertThat(item.getId(), is(equalTo(1)));
        assertThat(item.getDescription(), is(equalTo("")));
        assertThat(item.getPrevious(), is(equalTo(null)));
    }

    @Test
    public void testCreateItemWithDesc() {
        Item item = new Item(2, "test item");

        assertThat(item.getId(), is(equalTo(2)));
        assertThat(item.getDescription(), is(equalTo("test item")));
        assertThat(item.getPrevious(), is(equalTo(null)));
    }

    @Test
    public void testSetDescription() {
        Item item = new Item(3);

        item.setDescription("new description");

        assertThat(item.getDescription(), is(equalTo("new description")));
    }

    @Test
    public void testSetPrevious() {
        Item item = new Item(4);
        Item prev_item = new Item(3);

        item.setPrevious(prev_item);

        assertThat(item.getPrevious(), is(equalTo(prev_item)));
    }

}