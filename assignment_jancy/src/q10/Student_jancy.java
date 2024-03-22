package q10;

public class Student_jancy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_jancy[] students = new Student_jancy[3];

        // Create and set information for three students
        students[0] = new Student_jancy();
        students[0].setInfo("Sam", 19, "Navelim.");

        students[1] = new Student_jancy();
        students[1].setInfo("Alina", 20,"Panaji");

        students[2] = new Student_jancy();
        students[2].setInfo("Benson", 17, "Sanguem");

        // Display information for all students
     // Display information for all students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            students[i].displayInfo();
            System.out.println();
        }
    }

	    private String name;
	    private int age;
	    private String address;

	    public Student_jancy() {
	        name = "unknown";
	        age = 0;
	        address = "not available";
	    }

	    public void setInfo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void setInfo(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	    }
	
	}
	


