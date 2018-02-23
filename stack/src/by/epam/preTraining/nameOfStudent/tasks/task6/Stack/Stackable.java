/*
 * 
 *
 * @version 1.00
 *
 * @since 23 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */


package by.epam.preTraining.nameOfStudent.tasks.task6.stack;

public interface Stackable<T> {
	/* метод добавляет элемент в конец стека, который называется его вершиной; */
	public void push(T newElement);
	/*Vметод удаляет с одновременным возвратом удаляемого элемента из вершины стека, если стек непустой;*/
	public T pop(); 
	/*Vметод возвращает элемент из вершины стека, если стек не пустой; метод не должен удалять элемент из стека;*/
	public T peek();
	/*Vметод возвращает общее количество элементов в стеке.*/
	public int size();
	/*Vметод возвращает булевское значение true, если стек является пустым, в противном случае метод должен возвращать false;*/
	public boolean isEmpty();
	/*Vметод возвращает булевское значение true, если стек полностью заполнен, в противном случае метод должен возвращать false.*/
	public boolean isFull();
}