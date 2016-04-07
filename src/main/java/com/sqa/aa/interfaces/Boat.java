/**
 *   File Name: Boat.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.aa.interfaces;

/**
 * Boat //ADDD (description of class)
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
public class Boat implements IVehicle, ICruise {
	private String name = "Plain Boat";
	double waterDepth = 0;

	public Boat() {
	}

	public Boat(String name, double waterDepth) {
		setName(name);
		this.waterDepth = waterDepth;
	}

	/**
	 * @see com.sqa.aa.interfaces.IVehicle#calcSpeed()
	 */
	@Override
	public int calcSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.sqa.aa.interfaces.ICruise#cruise()
	 */
	@Override
	public boolean cruise() {
		if (this.waterDepth > .5) {
			System.out.println("The boat is gliding on water.");
		} else {
			System.out.println("This boat is gonna sink!");
		}

		return true;

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
		cruise();
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