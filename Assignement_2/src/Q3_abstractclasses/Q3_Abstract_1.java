package Q3_abstractclasses;
//Question 3
//Build an abstract class with protected abstract methods and test how 
//subclasses implement and access them. 
public abstract class Q3_Abstract_1 {

	protected abstract void animalrunning();

	protected abstract void animaleating();

	public abstract void animalsleeping();
	
	protected void allanimal () {
		
		System.out.println("All Anilmal is enjoying hrere");
	}
}
