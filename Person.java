class Person {
    public String Name;
    public String Address;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }
}

class Student extends Person {
    private String Program;
    private int Year;

    public Student(String Name, String Address, String Program, int Year) {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
    }

    public Student() {
        //TODO Auto-generated constructor stub
    }

    public void setProgram(String program) {
        this.Program = program;
    }

    public String getProgram() {
        return Program;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public int getYear() {
        return Year;
    }

    public String getStudentId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentId'");
    }

    public void setStudentId(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStudentId'");
    }
}