package types;

import com.swen6301.builder.types.BloodType;

public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int weight;
    private String sex;
    private int height;
    private boolean organDonor;
    private BloodType bloodType;

    private Patient(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.weight = builder.weight;
        this.sex = builder.sex;
        this.height = builder.height;
        this.organDonor = builder.organDonor;
        this.bloodType = builder.bloodType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getSex() {
        return sex;
    }

    public int getHeight() {
        return height;
    }

    public boolean isOrganDonor() {
        return organDonor;
    }


    public BloodType getBloodType() {
        return bloodType;
    }
    /**
     * This class is to
     */
    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private int weight;
        private String sex;
        private int height;
        private boolean organDonor;
        private BloodType bloodType;

        public Builder() {
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setOrganDonor(boolean isOrganDonor) {
            this.organDonor = isOrganDonor;
            return this;
        }

        public Builder setBloodType(BloodType bloodType) {
            this.bloodType = bloodType;
            return this;
        }


        public Patient build() {
            return new Patient(this);
        }
    }



    @Override
    public String toString() {
        return "Patient [" + this.firstName + ", " + this.lastName + "] has been successfully processed!";
    }
}
