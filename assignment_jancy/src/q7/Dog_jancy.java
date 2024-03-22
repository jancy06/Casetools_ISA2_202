package q7;

public class Dog_jancy {
	
	
	 private String name;
	    private String breed;
	   
	    public Dog_jancy(String name, String breed) {
	        this.name =name;
	        this.breed = breed;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    } 
	    public String getBreed() {
	        return breed;
	    }
	    public void setBreed(String breed) {
	        this.breed = breed;
	    }
	    public static void main(String[] args) {
	      
	        Dog_jancy dog1 = new Dog_jancy("Tommy", "Bull Dog");
	        Dog_jancy dog2 = new Dog_jancy("Cucu", "German Shepherd");

	    
	        System.out.println("Initial values:");
	        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
	        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());


	        dog1.setName("Charlie");
	        dog2.setBreed("Golden Retriever");

	        
	        System.out.println("\nUpdated values:");
	        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
	        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
	    }
	}


