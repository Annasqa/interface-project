/**
 *   File Name: Train.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.aa.interfaces;

/**
 * Train //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Train implements IVehicle {

	private String name = "Plain train";

	public Train() {
	}

	public Train(String name) {
		setName(name);
	}

	/**
	 * @see com.sqa.aa.interfaces.IVehicle#calcSpeed()
	 */
	@Override
	public int calcSpeed() {

		return 0;

	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * @see com.sqa.aa.interfaces.IVehicle#moveVehicle()
	 */
	@Override
	public boolean moveVehicle() {

		System.out.println("Chooo-Chooo");

		return true;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see com.sqa.aa.interfaces.IVehicle#stopVehicle()
	 */
	@Override
	public double stopVehicle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append(this.getClass().getSimpleName() + " \"" + getName() + "\"");
		return stringbuilder.toString();
	}

}
