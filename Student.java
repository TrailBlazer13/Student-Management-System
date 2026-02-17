public final class Student {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;
    private final String email;
    private final String phoneNumber;
    private final String address;
    private final String course;
    private final int yearLevel;

    
    // Private constructor: can only be called by Builder
    private Student(Builder builder) {
    this.id = builder.id;
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.gender = builder.gender;
    this.email = builder.email;
    this.phoneNumber = builder.phoneNumber;
    this.address = builder.address;
    this.course = builder.course;
    this.yearLevel = builder.yearLevel;
}


    // Getters only (NO setters = immutable)
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getCourse(){
        return course;
    }
    
    public int getYearLevel(){
        return yearLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + '\'' +
                ", gender=" + gender + '\'' +
                ", email=" + email + '\'' +
                ", phonenumber=" + phoneNumber + '\'' +
                ", address=" + address + '\'' +
                ", course=" + course + '\'' +
                ", yearlevel=" + yearLevel + 
                '}';
    }

    // ✅ Static Nested Builder Class
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
