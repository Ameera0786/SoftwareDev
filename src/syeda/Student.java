package syeda;

public class Student {
    private String firstname;
    private String lastname;
    private int id;

    public Student(String fullname, int id){
        firstname = fullname.substring(0,fullname.indexOf(" "));
        lastname = fullname.substring(fullname.indexOf(" ")+1);
        this.id = id;
    }
    public Student(String firstname, String lastname, int id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }
    public String toString(){
        return firstname + " " + lastname + " " + id;
    }
    public String getFullname() {
        return firstname + " " + lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname() {
        this.lastname = lastname;
    }
    public boolean equals(Student that){
        return this.firstname.equals(that.firstname) && this.lastname.equals(that.lastname);
    }
    public int getId() {
        return id;
    }
}
