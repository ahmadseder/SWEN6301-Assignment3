package com.swen6301.builder.util;
import com.swen6301.builder.types.BloodType;
import types.Patient;

/**
 * Contains utilities to communicate with internal storage.
 */
public final class PersistenceUtils {

	/**
	 * A private constructor to prevent accidental instantiations of this class.
	 */
	private PersistenceUtils() {
		throw new IllegalAccessError("Cannot instantiate instance for PersistenceUtils class");
	}
	
	/**
	 * Stores patient's info in internal storage
	 * Check {@link com.swen6301.builder.util.ValidationUtils} to see required info and non-required fields.
	 *
	 * @param patient Corresponds to the patient {@link Patient} object.
	 * @return true, if the patient info confirms to the requirement set forth, otherwise an {@link IllegalArgumentException} will be thrown.
	 */
	public static boolean storePatientInfo(Patient patient) {
		try {
			ValidationUtils.checkPatientInfo(patient);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
		// hidden implementation details for persisting patient info to internal storage.
		return true;
	}
	
}
