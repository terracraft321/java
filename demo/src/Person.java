public class Person {
    public String name; // private = restricted access
    public int a;
    public double b;

    // Getter
    public String getName() {
        return name;
    }
    public int getInt() {
        return a;
    }

    public double getB() {
        return b;
    }

    // Setter
    public void setName(String newName, int a) {
        this.name = newName;
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public class Main extends Person {
        public void main(String[] args) {
            Person myObj = new Person();
            this.setName("Bob", 1);  // error
            System.out.println(myObj.name); // error
        }
    }
    }