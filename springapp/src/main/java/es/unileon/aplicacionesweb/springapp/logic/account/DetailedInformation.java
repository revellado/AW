package es.unileon.aplicacionesweb.springapp.logic.account;

/**
 * 
 * Extra information of a transaction
 */
public class DetailedInformation {

	/**
	 * The extra information.
	 */
	private StringBuilder info;

	/**
	 * Sets if the information is editable or not.
	 */
	private boolean nonEditable;

	/**
	 * 
	 * @param information
	 */
	public DetailedInformation(String information) {
		this.info = new StringBuilder(information);
		this.nonEditable = false;
	}

	/**
	 * Empty constructor.
	 */
	public DetailedInformation() {
		this("");
	}

	/**
	 * This method appends information to the previous information if it is
	 * editable.
	 * 
	 * @param information
	 *            we want to add.
	 */
	public void appendInformation(String information) {
		if (!this.nonEditable) {
			this.info.append(information);
			if (information.charAt(information.length() - 1) != '\n') {
				this.info.append("\n");
			}
		}
	}

	/**
	 * This method appends information to the previous information.
	 * 
	 * @param information
	 *            we want to add.
	 */
	public void appendInformaton(StringBuffer information) {
		this.appendInformation(information.toString());
	}

	/**
	 * This method change the extra information to not editable.
	 */
	public void doFinal() {
		this.nonEditable = true;
	}

	/**
	 * 
	 * @return the extra information.
	 */
	@Override
	public String toString() {
		return this.info.toString();
	}

	/**
	 * Information getter.
	 * 
	 * @return the extra information.
	 */
	public StringBuilder getInfo() {
		return info;
	}

	/**
	 * Information setter.
	 * 
	 * @param info
	 */
	public void setInfo(StringBuilder info) {
		this.info = info;
	}

	/**
	 * 
	 * @return if the information is editable or not.
	 */
	public boolean isNonEditable() {
		return nonEditable;
	}

	/**
	 * Sets the information editable or not.
	 * 
	 * @param nonEditable
	 *            true for not editable, false otherwise.
	 */
	public void setNonEditable(boolean nonEditable) {
		this.nonEditable = nonEditable;
	}
}
