/*
 * StackOutOfBoundsException
 *
 * @version 1.00
 *
 * @since 23 Feb 2018
 *
 * @author Maskim Sardyka
 */


package by.epam.preTraining.nameOfStudent.tasks.task6.exception;

import by.epam.preTraining.nameOfStudent.tasks.task6.view.View;

public class StackOutOfBoundsException extends Exception {
	/**
	 * This exception throws when somebody try to access non existing stack element  
	 *
	 * @version 1.00 23 ����. 2018 �.
	 * @author Maksim Sardyka
	 */
	private static final long serialVersionUID = 1L;
	public void showError(){
		View.print("This element didnt exists\n");
		this.printStackTrace();
	}
}
