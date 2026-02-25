public final class Student {
    private final int ID;
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final int AGE;
    private final String GENDER;
    private final String EMAIL;
    private final String PHONE_NUMBER;
    private final String ADDRESS;
    private final String COURSE;
    private final int YEAR_LEVEL;

    
    // Private constructor: can only be called by Builder
    private Student(Builder builder) {
        this.ID = builder.id;
        this.FIRST_NAME = builder.firstName;
        this.LAST_NAME = builder.lastName;
        this.AGE = builder.age;
        this.GENDER = builder.gender;
        this.EMAIL = builder.email;
        this.PHONE_NUMBER = builder.phoneNumber;
        this.ADDRESS = builder.address;
        this.COURSE = builder.course;
        this.YEAR_LEVEL = builder.yearLevel;
    }


    // Getters only (NO setters = immutable)
    public int getId() {
        return ID;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public int getAge() {
        return AGE;
    }
    
    public String getGender() {
        return GENDER;
    }
    
    public String getEmail(){
        return EMAIL;
    }
    
    public String getPhoneNumber(){
        return PHONE_NUMBER;
    }
    
    public String getAddress(){
        return ADDRESS;
    }
    
    public String getCourse(){
        return COURSE;
    }
    
    public int getYearLevel(){
        return YEAR_LEVEL;
    }

@Override
    public String toString() {
        return "Student{" +
                "id=" + ID +
                ", firstName='" + FIRST_NAME + '\'' +
                ", lastName='" + LAST_NAME + '\'' +
                ", age=" + AGE + '\'' +
                ", gender=" + GENDER + '\'' +
                ", email=" + EMAIL + '\'' +
                ", phonenumber=" + PHONE_NUMBER + '\'' +
                ", address=" + ADDRESS + '\'' +
                ", course=" + COURSE + '\'' +
                ", yearlevel=" + YEAR_LEVEL + 
                '}';
    }

    // Static Nested Builder Class
    public static class Builder {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String email;
        private String phoneNumber;
        private String address;
        private String course;
        private int yearLevel;

        
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
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
        
        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setYearLevel(int yearLevel) {
            this.yearLevel = yearLevel;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
        
    }
}
