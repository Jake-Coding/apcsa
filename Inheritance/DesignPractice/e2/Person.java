public class Person {
    private String first;
    private String last;

    public Person() {
        first = "";
        last = "";
    }

    public Person(String fname, String lname) {
        first = fname;
        last = lname;
    }

    public String getFirst() {return first;}
    public String getLast() {return last;}

    public void printLastFirst() {
        System.out.println(last + ", " + first);
    }

    public void print() {
        System.out.println(this.toString());
    }

    public String toString() {
        return first + " " + last;
    }

    public boolean equals(Object o) {
        return (o instanceof Person && (((Person) o).getFirst().equals(first) && ((Person) o).getLast().equals(last)));
    }

    public Person getCopy() {
        return new Person(first, last);
    }

    public void copy(Person e) {
        this.first = e.getFirst();
        this.last = e.getLast();
    }

    protected void setfl(String first, String last) {
        this.first = first;
        this.last = last;
    }
}