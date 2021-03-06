/*
 * Queue.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.array;

import by.epam.task6.exceptions.ThisElementDidntExistsException;
import by.epam.task6.interfaces.QueueUnlimitedable;

public class QueueUnlimitedArray<T> extends AdtArray<T> implements QueueUnlimitedable<T> {
    /**
     * This is queue(FIFO) implementation
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */
    
    /* Constructor */
    public QueueUnlimitedArray() {
	arr = (T[]) new Object[DEFAULT_SIZE];
    }

    // Add elements to the queue
    public void enqueue(T newElement) {
	if (arr.length == size) {
	    resize(size + INCREASE_SIZE_STEP);
	}
	arr[++size] = newElement;
    }

    /* Function to remove front element from the queue */
    // Dequeue method to remove head
    public T dequeue() throws ThisElementDidntExistsException {
	T result;

	if (isEmpty()) {
	    throw new ThisElementDidntExistsException("Dequeue: queue is empty");
	}
	result = arr[0];

	for (int x = 0; x < size; x++) {
	    arr[x] = arr[x + 1];
	}
	size--;
	return result;
    }

    /* Function to check the front element of the queue */
    public T peek() throws ThisElementDidntExistsException {
	if (isEmpty())
	    throw new ThisElementDidntExistsException("Peek: queue is empty");
	return arr[size-1];
    }
}
