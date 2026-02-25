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
