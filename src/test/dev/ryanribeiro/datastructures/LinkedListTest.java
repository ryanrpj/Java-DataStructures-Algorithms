package dev.ryanribeiro.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListTest {
    @Test
    public void canInitializeWithZeroElements() {
        final LinkedList<Integer> list = new LinkedList<>();

        assertEquals(list.size(), 0);
        assertEquals(list.toString(), "[]");
    }

    @Test
    public void canInitializeWithMultipleElements() {
        final LinkedList<Integer> list = new LinkedList<>(1, 2, 3);

        assertEquals(list.size(), 3);
        assertEquals(list.toString(), "[1, 2, 3]");
    }

    @Test
    public void canAppendAnElement() {
        final LinkedList<Integer> list = new LinkedList<>(1);
        assertEquals(list.size(), 1);

        list.append(3);
        assertEquals(list.size(), 2);
        assertEquals(list.toString(), "[1, 3]");
    }

    @Test
    public void canPrependAnElement() {
        final LinkedList<Integer> list = new LinkedList<>(2, 3);
        assertEquals(list.size(), 2);

        list.prepend(1);
        assertEquals(list.size(), 3);
        assertEquals(list.toString(), "[1, 2, 3]");
    }

    @Test
    public void canRemoveTheLastElement() {
        final LinkedList<Integer> list = new LinkedList<>(1, 2);

        final int removedElement = list.removeLast();
        assertEquals(removedElement, 2);
        assertEquals(list.size(), 1);
        assertEquals(list.toString(), "[1]");

        list.removeLast();
        assertNull(list.removeLast());
        assertEquals(list.size(), 0);
        assertEquals(list.toString(), "[]");
    }

    @Test
    public void canAppendAnElementAfterRemovingLast() {
        final LinkedList<Integer> list = new LinkedList<>(1);

        list.removeLast();
        list.removeLast();
        list.append(2);
        list.append(3);

        assertEquals(list.size(), 2);
        assertEquals(list.toString(), "[2, 3]");
    }

    @Test
    public void canPrependAnElementAfterRemovingLast() {
        final LinkedList<Integer> list = new LinkedList<>(1);

        list.removeLast();
        list.removeLast();
        list.prepend(3);
        list.prepend(2);

        assertEquals(list.size(), 2);
        assertEquals(list.toString(), "[2, 3]");
    }

    @Test
    public void canRemoveTheFirstElement() {
        final LinkedList<Integer> list = new LinkedList<>(1, 2);

        final int removedElement = list.removeFirst();
        assertEquals(removedElement, 1);
        assertEquals(list.size(), 1);
        assertEquals(list.toString(), "[2]");

        list.removeFirst();
        assertNull(list.removeFirst());
        assertEquals(list.size(), 0);
        assertEquals(list.toString(), "[]");
    }

    @Test
    public void canAppendAnElementAfterRemovingFirst() {
        final LinkedList<Integer> list = new LinkedList<>(1);

        list.removeFirst();
        list.removeFirst();
        list.append(2);
        list.append(3);

        assertEquals(list.size(), 2);
        assertEquals(list.toString(), "[2, 3]");
    }

    @Test
    public void canPrependAnElementAfterRemovingFirst() {
        final LinkedList<Integer> list = new LinkedList<>(1);

        list.removeFirst();
        list.removeFirst();
        list.prepend(3);
        list.prepend(2);

        assertEquals(list.size(), 2);
        assertEquals(list.toString(), "[2, 3]");
    }

    @Test
    public void canPrintElementsToConsole() {
        final LinkedList<Integer> list = new LinkedList<>(1, 2, 3);

        assertEquals(list.toString(), "[1, 2, 3]");
    }
}
