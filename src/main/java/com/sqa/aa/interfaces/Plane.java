/**
 *   File Name: Plane.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.aa.interfaces;

/**
 * Plane //ADDD (description of class)
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
public class Plane implements IVehicle, IFlyingObject {
	private String name = "Plain Plane";

	public Plane() {
	}

	public Plane(String name) {
		setName(name);
	}

	/**
	 * @see com.sqa.aa.interfaces.IVehicle#calcSpeed()
	 */
	@Override
	public int calcSpeed() {
		System.out.println("Plane is flying high");
		return 0;
	}

	/**
	 * @see com.sqa.aa.interfaces.IFlyingObject#fly()
	 */
	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
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
		System.out.println("Zoooom");
		fly();
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
