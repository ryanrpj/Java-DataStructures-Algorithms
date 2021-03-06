package dev.ryanribeiro.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    @Test
    public void canInitializeWithZeroElements() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        assertEquals(0, list.size());
        assertEquals("[]", list.toString());
    }

    @Test
    public void canInitializeWithMultipleElements() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1, 2, 3);

        assertEquals(3, list.size());
        assertEquals("[1, 2, 3]", list.toString());
    }

    @Test
    public void canGetAnElementByIndex() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1, 2, 3, 4);

        final int firstRetrievedElement = list.get(0);
        final int secondRetrievedElement = list.get(1);
        final int thirdRetrievedElement = list.get(2);
        final int fourthRetrievedElement = list.get(3);
        final Integer fifthRetrievedElement = list.get(4);

        assertEquals(1, firstRetrievedElement);
        assertEquals(2, secondRetrievedElement);
        assertEquals(3, thirdRetrievedElement);
        assertEquals(4, fourthRetrievedElement);
        assertNull(fifthRetrievedElement);
    }

    @Test
    public void canInsertAnElementByIndex() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        final boolean firstElementInserted = list.insert(0, 1);
        final boolean secondElementInserted = list.insert(1, 3);
        final boolean thirdElementInserted = list.insert(2, 4);
        final boolean fourthElementInserted = list.insert(1, 2);
        final boolean fifthElementInsert = list.insert(10, 5);

        assertTrue(firstElementInserted);
        assertTrue(secondElementInserted);
        assertTrue(thirdElementInserted);
        assertTrue(fourthElementInserted);
        assertFalse(fifthElementInsert);
        assertEquals(4, list.size());
        assertEquals("[1, 2, 3, 4]", list.toString());
    }

    @Test
    public void canRemoveAnElementByIndex() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1, 2, 3, 4, 5);

        final int firstRemovedElement = list.remove(0);
        final int secondRemovedElement = list.remove(3);
        final int thirdRemovedElement = list.remove(1);

        assertEquals(1, firstRemovedElement);
        assertEquals(5, secondRemovedElement);
        assertEquals(3, thirdRemovedElement);
        assertEquals(2, list.size());
        assertEquals("[2, 4]", list.toString());
    }

    @Test
    public void canReplaceAnElementByIndex() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1, 1, 2, 4);

        final int firstReplacedElement = list.replace(1, 2);
        final int secondReplacedElement = list.replace(2, 3);

        assertEquals(1, firstReplacedElement);
        assertEquals(2, secondReplacedElement);
        assertNull(list.replace(10, 5));
        assertEquals("[1, 2, 3, 4]", list.toString());
    }

    @Test
    public void canAppendAnElement() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.append(3);
        list.append(4);
        assertEquals(2, list.size());
        assertEquals("[3, 4]", list.toString());
    }

    @Test
    public void canPrependAnElement() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(2, 3);

        list.prepend(1);
        assertEquals(3, list.size());
        assertEquals("[1, 2, 3]", list.toString());
    }

    @Test
    public void canRemoveTheLastElement() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1, 2);

        final int removedElement = list.removeLast();
        assertEquals(2, removedElement);
        assertEquals(1, list.size());
        assertEquals("[1]", list.toString());

        list.removeLast();
        assertNull(list.removeLast());
        assertEquals(0, list.size());
        assertEquals("[]", list.toString());
    }

    @Test
    public void canAppendAnElementAfterRemovingLast() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);

        list.removeLast();
        list.removeLast();
        list.append(2);
        list.append(3);

        assertEquals(2, list.size());
        assertEquals("[2, 3]", list.toString());
    }

    @Test
    public void canPrependAnElementAfterRemovingLast() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);

        list.removeLast();
        list.removeLast();
        list.prepend(3);
        list.prepend(2);

        assertEquals(2, list.size());
        assertEquals("[2, 3]", list.toString());
    }

    @Test
    public void canRemoveTheFirstElement() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1, 2);

        final int firstRemovedElement = list.removeFirst();
        assertEquals(1, firstRemovedElement);
        assertEquals(1, list.size());
        assertEquals("[2]", list.toString());

        final int secondRemovedElement = list.removeFirst();
        assertEquals(2, secondRemovedElement);
        assertNull(list.removeFirst());
        assertEquals(0, list.size());
        assertEquals("[]", list.toString());
    }

    @Test
    public void canAppendAnElementAfterRemovingFirst() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);

        list.removeFirst();
        list.removeFirst();
        list.append(2);
        list.append(3);

        assertEquals(2, list.size());
        assertEquals("[2, 3]", list.toString());
    }

    @Test
    public void canPrependAnElementAfterRemovingFirst() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1);

        list.removeFirst();
        list.removeFirst();
        list.prepend(3);
        list.prepend(2);

        assertEquals(2, list.size());
        assertEquals("[2, 3]", list.toString());
    }

    @Test
    public void canReverseTheOrderOfTheElements() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.reverse();

        assertEquals("[]", list.toString());

        list.append(1);
        list.reverse();

        assertEquals("[1]", list.toString());

        list.append(2);
        list.append(3);
        list.append(4);

        list.reverse();
        assertEquals("[4, 3, 2, 1]", list.toString());
    }

    @Test
    public void canPrintElementsToConsole() {
        final DoublyLinkedList<Integer> list = new DoublyLinkedList<>(1, 2, 3);

        assertEquals("[1, 2, 3]", list.toString());
    }
}
