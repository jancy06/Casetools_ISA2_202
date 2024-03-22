package q8;

public class Employee_jancy {
 
	  private String name;
	    private String jobTitle;
	    private double basicSalary;
	    
	    public Employee_jancy(String name, String jobTitle, double basicSalary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.basicSalary = basicSalary;
	    }
	    public double calculateDA() {
	        return 0.10 * basicSalary;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getJobTitle() {
	        return jobTitle;
	    }
	    public void setJobTitle(String jobTitle) {
	        this.jobTitle = jobTitle;
	    }
	    public double getBasicSalary() {
	        return basicSalary;
	    }
	    public void setBasicSalary(double basicSalary) {
	        this.basicSalary = basicSalary;
	    }
	}
	

