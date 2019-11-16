package com.swen6301.builder.util;
import com.swen6301.builder.types.BloodType;
import types.Patient;

/**
 * A utility class containing a set of utilities to perform input validations.
 */
public final class ValidationUtils {
	private static int MIN_AGE = 0;
	private static int MAX_AGE = 120;
	private static int MIN_HEIGHT = 0;
	private static int MAX_HEIGHT = 120;
	private static int MIN_WEIGHT = 0;
	private static int MAX_WEIGHT = 300;


	/**
	 * A private constructor to prevent accidental instantiations of this class.
	 */
	private ValidationUtils() {
		throw new IllegalAccessError("Cannot instantiate instance for ValidationUtils class");
	}
	
	/**
	 * Checks whether patient's info is correct.
	 * 
	 * @param patient Corresponds to the patient. This cannot be empty.
	 * @return true, if the patient info confirms to the requirement set forth, otherwise an {@link IllegalArgumentException} will be thrown.
	 */
	public static boolean checkPatientInfo(Patient patient) {

		validateFirstName(patient.getFirstName());
		validateMiddleName(patient.getMiddleName());
		validateLastName(patient.getLastName());
		validateAge(patient.getAge());
		validateWeight(patient.getWeight());
		validateHeight(patient.getHeight());
		validateSex(patient.getSex());
		validateBloodType(patient.getBloodType());

		return true;
	}

	private static boolean validateBloodType(com.swen6301.builder.types.BloodType bloodType) {
		if(bloodType == null) {
			throw new IllegalArgumentException("Blood type cannot be null.");
		}
		return true;
	}

	private static boolean validateSex(String sex) {
		String errorMessage = "Sex can only be either 'male', 'female', or 'none'.";
		if(isNullOrEmpty(sex)) {
			throw new IllegalArgumentException(errorMessage);
		}

		String sexLowerCase = sex.toLowerCase();

		if(isNullOrEmpty(sex) || (!"male".equals(sexLowerCase) && !"female".equals(sexLowerCase) && !"none".equals(sexLowerCase))) {
			throw new IllegalArgumentException(errorMessage);
		}
		return true;
	}

	private static boolean validateHeight(int height) {
		if(height < MIN_HEIGHT || height > MAX_HEIGHT) {
			throw new IllegalArgumentException("Height cannot negative or larger than 250.");
		}
		return true;
	}

	private static boolean validateWeight(int weight) {
		if(weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
			throw new IllegalArgumentException("Weight cannot negative or larger than 300.");
		}
		return true;
	}

	private static boolean validateAge(int age) {
		if(age < MIN_AGE || age > MAX_AGE) {
			throw new IllegalArgumentException("Age cannot be negative or larger than 120.");
		}
		return true;
	}

	private static boolean validateLastName(String lastName) {
		if(isNullOrEmpty(lastName)) {
			throw new IllegalArgumentException("Last name cannot be empty of null.");
		}
		return true;
	}

	private static boolean validateMiddleName(String middleName) {
		if(middleName == null) {
			throw new IllegalArgumentException("Middle name cannot be null.");
		}
		return true;
	}


	private static boolean validateFirstName(String firstName){
		if(isNullOrEmpty(firstName)) {
			throw new IllegalArgumentException("First name cannot be empty of null.");
		}
		return true;
	}

	private static boolean isNullOrEmpty(String string){
		return string == null || string.isEmpty();
	}

}
